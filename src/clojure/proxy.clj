(ns proxy
  (:require
   [babashka.process :as p]
   [big-config :as bc]
   [big-config.core :refer [->workflow ok]]
   [cheshire.core :as json]
   [clojure.java.io :as io]
   [server :refer [create-server get-os]])
  (:import
   [clojure.lang IDeref]
   (com.terraform.plugin.v6 ProviderGrpc ProviderGrpc$ProviderImplBase)
   (io.grpc ManagedChannel)
   [io.grpc.netty NettyChannelBuilder]
   [io.grpc.stub StreamObserver]
   [io.netty.channel.kqueue KQueueDomainSocketChannel KQueueEventLoopGroup]
   [io.netty.channel.unix DomainSocketAddress]
   [java.io Closeable File]))

(defn ->proxy-observer [observer]
  (let [values (atom [])        ;; State to hold the stream values
        completed (atom false)  ;; To track if onCompleted was called
        error (atom nil)]       ;; To track any exceptions
    (reify StreamObserver
      (onNext [_ value]
        (swap! values conj value)
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

(defmacro ->provider-proxy [interface-class provider & overrides]
  (let [override-map (apply hash-map overrides)
        methods (.getMethods (resolve interface-class))
        method-names (->> (map #(.getName %) methods)
                          (filter (fn [x] (not (#{"bindService"
                                                  "equals"
                                                  "toString"
                                                  "hashCode"
                                                  "getClass"
                                                  "notify"
                                                  "notifyAll"
                                                  "wait"} x)))))]
    `(proxy [~interface-class] []
       ~@(for [m-name method-names]
           (if-let [custom-impl (get override-map (keyword m-name))]
             `(~(symbol m-name) [& args#] (apply ~custom-impl args#))
             `(~(symbol m-name) [request# observer#]
                                (let [proxy-observer# (->proxy-observer observer#)]
                                  (tap> [(keyword ~m-name) [request# proxy-observer#]])
                                  (~(symbol (str "." m-name)) ~provider request# proxy-observer#))))))))

(comment
  (-> (resolve 'ProviderGrpc$ProviderImplBase)
      .getMethods
      (->> (mapv #(.getParameters %))
           (mapv count))

      #_(->> (map #(.getName %))
             (filter (fn [x] (not (#{"bindService"
                                     "equals"
                                     "toString"
                                     "hashCode"
                                     "getClass"
                                     "notify"
                                     "notifyAll"
                                     "wait"} x)))))))

(defn ->proxy-provider-service [^ManagedChannel real-channel]
  (tap> real-channel)
  (let [real-provider (ProviderGrpc/newStub real-channel)]
    (->provider-proxy ProviderGrpc$ProviderImplBase real-provider)))

(def proxy-socket-path "/tmp/tf-provider.sock")

(declare real-socket-path)

(def data {"registry.terraform.io/hetznercloud/hcloud" {:Protocol "grpc"
                                                        :ProtocolVersion 6
                                                        :Pid (.pid (java.lang.ProcessHandle/current))
                                                        :Test true
                                                        :Addr {:Network "unix"
                                                               :String proxy-socket-path}}})

(defonce server (atom nil))

(defn start-server [provider-service]
  (let [s (create-server provider-service)]
    (reset! server s)
    (.start s)
    (-> data
        json/generate-string
        (->> (format "TF_REATTACH_PROVIDERS='%s'"))
        println)
    (.awaitTermination s)))

(defn stop-server []
  (when-let [s @server]
    (.shutdown s)
    (reset! server nil)))

(defn closeable
  ([value] (closeable value identity))
  ([value close] (reify
                   IDeref
                   (deref [_] value)
                   Closeable
                   (close [_] (close value)))))

(defn create-grpc-channel
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

(comment
  (def real-socket-path "/var/folders/r4/w6487z_x3jq6fzwt1w2k1v540000gn/T/plugin2192534776")
  (def real-channel (closeable
                     (create-grpc-channel real-socket-path)
                     (fn [^ManagedChannel channel]
                       (.shutdown channel))))
  (def provider-service (->proxy-provider-service @real-channel))

  (future (start-server provider-service))

  (stop-server))

(comment
  (do
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
      (let [real-channel (closeable
                          (create-grpc-channel real-socket-path)
                          (fn [^ManagedChannel channel]
                            (.shutdown channel)))
            proxy-server (create-server (->proxy-provider-service @real-channel))
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
                     ::proxy-data proxy-data})))
    (defn stop-proxy [{:keys [::proxy-server] :as opts}]
      (.shutdown proxy-server)
      (ok opts))
    (def wf (->workflow {:first-step ::start-real
                         :step-fns ["big-config.step-fns/bling-step-fn"]
                         :wire-fn (fn [step _]
                                    (case step
                                      ::start-real [start-hcloud-provider ::start-proxy]
                                      ::start-proxy [start-proxy ::stop-proxy]
                                      ::stop-proxy [stop-proxy ::stop-real]
                                      ::stop-real [stop-hcloud-provider ::end]
                                      ::end [identity]))}))
    (wf {})))
