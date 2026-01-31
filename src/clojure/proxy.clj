(ns proxy
  (:require
   [babashka.process :as p]
   [big-config :as bc]
   [big-config.core :refer [->workflow ok]]
   [big-config.render :as render]
   [big-config.run :as run]
   [cheshire.core :as json]
   [clojure.java.io :as io]
   [pronto.core :as pr]
   [server :refer [create-server get-os]])
  (:import
   [clojure.lang IDeref]
   (com.terraform.plugin.v6
    GetProviderSchema$Request
    GetProviderSchema$Response
    ProviderGrpc
    ProviderGrpc$ProviderImplBase)
   (io.grpc ManagedChannel)
   [io.grpc.netty NettyChannelBuilder]
   [io.grpc.stub StreamObserver]
   [io.netty.channel.kqueue KQueueDomainSocketChannel KQueueEventLoopGroup]
   [io.netty.channel.unix DomainSocketAddress]
   [java.io Closeable File]))

(pr/defmapper provider-mapper [GetProviderSchema$Request
                               GetProviderSchema$Response])

(defn ->proxy-observer [observer]
  (let [values (atom [])
        completed (atom false)
        error (atom nil)]
    (reify StreamObserver
      (onNext [_ value]
        (swap! values conj (pr/proto->proto-map provider-mapper value))
        (.onNext observer value))

      (onError [_ throwable]
        (reset! error throwable)
        (.onError observer throwable))

      (onCompleted [_]
        (reset! completed true)
        (.onCompleted observer))

      ;; Add a custom way to retrieve the data
      clojure.lang.IDeref
      (deref [_]
        {:values @values
         :completed @completed
         :error @error}))))

(defmacro proxy-service-macro [service stub tap-fn & overrides]
  (let [override-map (apply hash-map overrides)
        methods (.getMethods (resolve service))
        method-names (->> (map #(.getName %) methods)
                          (filter (fn [x] (not (#{"bindService"
                                                  "equals"
                                                  "toString"
                                                  "hashCode"
                                                  "getClass"
                                                  "notify"
                                                  "notifyAll"
                                                  "wait"} x)))))]
    `(proxy [~service] []
       ~@(for [method-name method-names]
           (if-let [custom-impl (get override-map (keyword method-name))]
             `(~(symbol method-name) [& args#] (apply ~custom-impl args#))
             `(~(symbol method-name) [request# observer#]
                                     (let [proxy-observer# (->proxy-observer observer#)]
                                       (~tap-fn (keyword ~method-name)
                                                (pr/proto->proto-map provider-mapper request#)
                                                proxy-observer#)
                                       (~(symbol (str "." method-name)) ~stub request# proxy-observer#))))))))

(defn ->proxy-service [^ManagedChannel real-channel tap-fn]
  (let [real-stub (ProviderGrpc/newStub real-channel)]
    (proxy-service-macro ProviderGrpc$ProviderImplBase real-stub tap-fn)))

(defn closeable
  ([value] (closeable value identity))
  ([value close] (reify
                   IDeref
                   (deref [_] value)
                   Closeable
                   (close [_] (close value)))))

(defn socket->grpc-channel
  [socket-path]
  (let [socket-file (File. socket-path)
        os (get-os)
        channel (case os
                  :osx (-> (NettyChannelBuilder/forAddress (DomainSocketAddress. socket-file))
                           (.channelType KQueueDomainSocketChannel)
                           (.eventLoopGroup (KQueueEventLoopGroup.))
                           (.usePlaintext)
                           (.build)))]
    channel))

(defn start-and-wait [cmd regex]
  (let [proc (p/process {:err :string} cmd) ;; Redirect stderr to see errors
        reader (io/reader (:out proc))]
    (try
      (loop []
        (if-let [line (.readLine reader)]
          (if (re-find regex line)
            [proc line]
            (do (Thread/sleep 100)
                (recur)))
          (throw (Exception. "Stream closed before regex was found"))))
      (catch Exception e
        (p/destroy proc) ;; Clean up if things go south
        (throw e)))))

(defn start-hcloud-provider [opts]
  (let [[proc line] (start-and-wait ".bin/terraform-provider-hcloud_v1.59.0 -debug" #"TF_REATTACH_PROVIDERS='.*'")]
    (merge opts {::bc/err nil
                 ::bc/exit 0
                 ::provider-process proc
                 ::real-socket-path (-> (second (re-find #"='(.*)'" line))
                                        (json/parse-string)
                                        (get-in ["registry.terraform.io/hetznercloud/hcloud" "Addr" "String"]))})))

(defn stop-hcloud-provider [{:keys [::provider-process] :as opts}]
  (p/destroy provider-process)
  (ok opts))

(defn start-proxy [{:keys [::real-socket-path] :as opts}]
  (let [messages (atom [])
        real-channel (closeable
                      (socket->grpc-channel real-socket-path)
                      (fn [^ManagedChannel channel]
                        (.shutdown channel)))
        proxy-server (create-server (->proxy-service @real-channel (fn [& xs] (swap! messages conj xs))))
        proxy-data {"registry.terraform.io/hetznercloud/hcloud" {:Protocol "grpc"
                                                                 :ProtocolVersion 6
                                                                 :Pid (.pid (java.lang.ProcessHandle/current))
                                                                 :Test true
                                                                 :Addr {:Network "unix"
                                                                        :String "/tmp/tf-provider.sock"}}}]

    (.start proxy-server)
    (merge opts {::bc/err nil
                 ::bc/exit 0
                 ::proxy-server proxy-server
                 ::proxy-data proxy-data
                 ::real-channel real-channel
                 ::messages messages})))

(defn stop-proxy [{:keys [::proxy-server ::real-channel] :as opts}]
  (.shutdown proxy-server)
  (.close real-channel)
  (ok opts))

(defn prepare [{:keys [::proxy-data] :as opts}]
  (merge opts {::run/shell-opts {:dir ".dist/alpha"
                                 :extra-env {"TF_REATTACH_PROVIDERS" (-> proxy-data
                                                                         json/generate-string)}}
               ::run/cmds [#_"tofu init" "tofu plan"]
               ::render/templates [{:template "alpha"
                                    :overwrite true
                                    :target-dir ".dist/alpha"
                                    :transform [["root"
                                                 :raw]]}]}))

(defn fix-messages [{:keys [::messages] :as opts}]
  (let [messages (-> messages
                     deref
                     (->> (mapv (fn [[procedure request response]]
                                  [procedure request (-> @response
                                                         :values
                                                         first)]))))]
    (merge opts {::bc/exit 0
                 ::bc/err nil
                 ::messages messages})))

(def proxy-wf (->workflow {:first-step ::start-real
                           :step-fns ["big-config.step-fns/bling-step-fn"]
                           :wire-fn (fn [step step-fns]
                                      (case step
                                        ::start-real [start-hcloud-provider ::start-proxy]
                                        ::start-proxy [start-proxy ::prepare]
                                        ::prepare [prepare ::render]
                                        ::render [render/render ::exec]
                                        ::exec [(partial run/run-cmds step-fns) ::stop-proxy]
                                        ::stop-proxy [stop-proxy ::stop-real]
                                        ::stop-real [stop-hcloud-provider ::fix-messages]
                                        ::fix-messages [fix-messages ::end]
                                        ::end [identity]))}))

(comment
  (into (sorted-map) (proxy-wf {::bc/env :repl})))
