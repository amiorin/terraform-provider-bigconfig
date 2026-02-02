(ns server
  (:require
   [babashka.fs :as fs]
   [big-config :as bc]
   [big-config.core :refer [->workflow ok]]
   [big-config.render :as render]
   [big-config.run :as run]
   [cheshire.core :as json]
   [clojure.java.io :as io]
   [pronto.core :as pr])
  (:import
   [clojure.lang IDeref]
   (com.terraform.plugin.v6
    ConfigureProvider$Request
    ConfigureProvider$Response
    GetProviderSchema$Request
    GetProviderSchema$Response
    PlanResourceChange$Request
    PlanResourceChange$Response
    ProviderGrpc
    ProviderGrpc$ProviderImplBase
    ServerCapabilities
    ValidateProviderConfig$Request
    ValidateProviderConfig$Response
    ValidateResourceConfig$Request
    ValidateResourceConfig$Response)
   io.grpc.ManagedChannel
   (io.grpc.netty NettyChannelBuilder NettyServerBuilder)
   (io.grpc.netty GrpcSslContexts)
   [io.grpc.stub StreamObserver]
   (io.netty.channel.epoll EpollEventLoopGroup EpollServerDomainSocketChannel)
   (io.netty.channel.kqueue KQueueDomainSocketChannel KQueueEventLoopGroup KQueueServerDomainSocketChannel)
   (io.netty.channel.unix DomainSocketAddress)
   (io.netty.handler.ssl ClientAuth)
   (java.io Closeable File)
   (java.util.concurrent TimeUnit)))

(defn get-os []
  (let [os-name (System/getProperty "os.name" "generic")]
    (cond
      (.startsWith os-name "Mac OS X") :osx
      (.startsWith os-name "Linux") :linux
      :else :unsupported)))

(defn- new-uds-builder [socket-path]
  (let [socket-file (File. socket-path)
        os (get-os)
        builder (case os
                  :osx (-> (NettyServerBuilder/forAddress (DomainSocketAddress. socket-file))
                           (.channelType KQueueServerDomainSocketChannel)
                           (.bossEventLoopGroup (KQueueEventLoopGroup.))
                           (.workerEventLoopGroup (KQueueEventLoopGroup.)))
                  :linux (-> (NettyServerBuilder/forAddress (DomainSocketAddress. socket-file))
                             (.channelType EpollServerDomainSocketChannel)
                             (.bossEventLoopGroup (EpollEventLoopGroup.))
                             (.workerEventLoopGroup (EpollEventLoopGroup.)))
                  (throw (UnsupportedOperationException. "Unsupported OS")))]
    builder))

(pr/defmapper provider-mapper [GetProviderSchema$Request
                               GetProviderSchema$Response
                               ValidateResourceConfig$Request
                               ValidateResourceConfig$Response
                               ValidateProviderConfig$Request
                               ValidateProviderConfig$Response
                               ConfigureProvider$Request
                               ConfigureProvider$Response
                               PlanResourceChange$Request
                               PlanResourceChange$Response
                               ServerCapabilities])

(defn- ->provider-service []
  (proxy [ProviderGrpc$ProviderImplBase] []
    (planResourceChange [request observer]
      (let [response (-> (pr/clj-map->proto-map provider-mapper PlanResourceChange$Response {})
                         pr/proto-map->proto)]
        (doto observer
          (.onNext response)
          (.onCompleted))))
    (configureProvider [request observer]
      (let [response (-> (pr/clj-map->proto-map provider-mapper ConfigureProvider$Response {})
                         pr/proto-map->proto)]
        (doto observer
          (.onNext response)
          (.onCompleted))))
    (validateProviderConfig [request observer]
      (let [response (-> (pr/clj-map->proto-map provider-mapper ValidateProviderConfig$Response {})
                         pr/proto-map->proto)]
        (doto observer
          (.onNext response)
          (.onCompleted))))
    (validateResourceConfig [request observer]
      (let [response (-> (pr/clj-map->proto-map provider-mapper ValidateResourceConfig$Response {})
                         pr/proto-map->proto)]
        (doto observer
          (.onNext response)
          (.onCompleted))))
    (getProviderSchema [request observer]
      (let [response (-> (pr/clj-map->proto-map provider-mapper GetProviderSchema$Response {:provider {:block {}}
                                                                                            :resource_schemas {"bigconfig_rama" {:block {}}}})
                         pr/proto-map->proto)]
        (doto observer
          (.onNext response)
          (.onCompleted))))))

(defn create-server [provider-service socket-path]
  (let [server-cert (io/file "certs/server-cert.pem")
        server-key (io/file "certs/server-key.pem")
        client-ca (io/file "certs/client-cert.pem")
        ssl-context (-> (GrpcSslContexts/forServer server-cert server-key)
                        (.trustManager client-ca)
                        (.clientAuth ClientAuth/REQUIRE)
                        (.build))]
    (-> (new-uds-builder socket-path)
        #_(.sslContext ssl-context)
        (.addService provider-service)
        (.build))))

(defn ->socket-path []
  (-> (fs/create-temp-file {:prefix "bigconfig-" :suffix ".sock"})
      (doto fs/delete)
      .toAbsolutePath
      .toString))

(defn start [{:keys [::block] :as opts}]
  (let [socket-path (->socket-path)
        provider-name "registry.terraform.io/amiorin/bigconfig"
        server (create-server (->provider-service) socket-path)
        stop-server (fn []
                      (.shutdown server)
                      (when-not (.awaitTermination server 30 TimeUnit/SECONDS)
                        (.shutdownNow server)))
        server-opts {provider-name {:Protocol "grpc"
                                    :ProtocolVersion 6
                                    :Pid (.pid (java.lang.ProcessHandle/current))
                                    :Test true
                                    :Addr {:Network "unix"
                                           :String socket-path}}}]

    (.start server)
    (when block
      (.addShutdownHook (Runtime/getRuntime) (Thread. stop-server))
      (.awaitTermination server))
    (-> (ok opts)
        (update ::servers (fnil conj []) {:proxy false
                                          :provider-name provider-name
                                          :socket-path socket-path
                                          :server server
                                          :opts server-opts}))))

(defn prepare [{:keys [::servers] :as opts}]
  (let [server-opts (-> servers
                        last
                        :opts)
        dir "tests/first"
        target-dir (format ".dist/%s" dir)]
    (merge opts (ok) {::run/shell-opts {:dir target-dir
                                        :out *err*
                                        :err *err*
                                        :extra-env {"TF_LOG" #_"TRACE" "ERROR"
                                                    "TF_REATTACH_PROVIDERS" (-> server-opts
                                                                                json/generate-string)}}
                      ::run/cmds ["tofu init" "tofu plan"]
                      ::render/templates [{:template dir
                                           :overwrite true
                                           :target-dir target-dir
                                           :transform [["root"
                                                        :raw]]}]})))
(defn stop [{:keys [::servers] :as opts}]
  (->> servers
       (map :server)
       (remove nil?)
       (run! #(.shutdown %1)))
  opts)
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

(defn ->proxy-service [^ManagedChannel stub-channel tap-fn]
  (let [stub (ProviderGrpc/newStub stub-channel)]
    (proxy-service-macro ProviderGrpc$ProviderImplBase stub tap-fn)))

(defn start-proxy [{:keys [::servers] :as opts}]
  (let [prev-socket-path (-> servers
                             last
                             :socket-path)
        provider-name (-> servers
                          last
                          :provider-name)
        socket-path (->socket-path)
        messages (atom [])
        channel-handle (closeable
                        (socket->grpc-channel prev-socket-path)
                        (fn [^ManagedChannel channel]
                          (.shutdown channel)))
        service (->proxy-service @channel-handle (fn [& xs] (swap! messages conj xs)))
        server (create-server service socket-path)
        server-opts {provider-name {:Protocol "grpc"
                                    :ProtocolVersion 6
                                    :Pid (.pid (java.lang.ProcessHandle/current))
                                    :Test true
                                    :Addr {:Network "unix"
                                           :String socket-path}}}]
    (.start server)
    (-> (merge opts (ok) {::messages messages})
        (update ::channels (fnil conj []) channel-handle)
        (update ::servers (fnil conj []) {:proxy true
                                          :provider-name provider-name
                                          :socket-path socket-path
                                          :server server
                                          :opts server-opts}))))

(def dev-wf (->workflow {:first-step ::start
                         :wire-fn (fn [step step-fns]
                                    (case step
                                      ::start [start ::start-proxy]
                                      ::start-proxy [start-proxy ::prepare]
                                      ::prepare [prepare ::render]
                                      ::render [render/render ::exec]
                                      ::exec [(partial run/run-cmds step-fns) ::end]
                                      ::end [stop]))}))

(comment
  (into (sorted-map) (dev-wf {::bc/env :repl})))

(def main-wf (->workflow {:first-step ::start
                          :wire-fn (fn [step _]
                                     (case step
                                       ::start [start ::end]
                                       ::end [identity]))}))

(comment
  (into (sorted-map) (main-wf {::block true
                               ::bc/env :repl})))
