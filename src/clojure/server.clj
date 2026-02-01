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
   (com.terraform.plugin.v6
    ConfigureProvider$Request
    ConfigureProvider$Response
    GetProviderSchema$Request
    GetProviderSchema$Response
    PlanResourceChange$Request
    PlanResourceChange$Response
    ProviderGrpc$ProviderImplBase
    ServerCapabilities
    ValidateProviderConfig$Request
    ValidateProviderConfig$Response
    ValidateResourceConfig$Request
    ValidateResourceConfig$Response)
   (io.grpc.netty NettyServerBuilder)
   (io.grpc.netty GrpcSslContexts)
   (io.netty.channel.epoll EpollEventLoopGroup EpollServerDomainSocketChannel)
   (io.netty.channel.kqueue KQueueEventLoopGroup KQueueServerDomainSocketChannel)
   (io.netty.channel.unix DomainSocketAddress)
   (io.netty.handler.ssl ClientAuth)
   (java.io File)
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

(comment
  (do
    (defn start [{:keys [::block] :as opts}]
      (let [socket-path (-> (fs/create-temp-file {:prefix "bigconfig-" :suffix ".sock"})
                            (doto fs/delete-if-exists)
                            .toAbsolutePath
                            .toString)
            server (create-server (->provider-service) socket-path)
            stop-server (fn []
                          (.shutdown server)
                          (when-not (.awaitTermination server 30 TimeUnit/SECONDS)
                            (.shutdownNow server)))
            server-opts {"registry.terraform.io/amiorin/bigconfig" {:Protocol "grpc"
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
            (update ::servers (fnil conj []) {:socket-path socket-path
                                              :server server
                                              :opts server-opts}))))

    (defn prepare [{:keys [::servers] :as opts}]
      (let [server-opts (-> servers
                            last
                            :opts)
            dir "tests/first"
            target-dir (format ".dist/%s" dir)]
        (merge opts (ok) {::run/shell-opts {:dir target-dir
                                            :out *out*
                                            :err *err*
                                            :extra-env {"TF_LOG" #_"DEBUG" "ERROR"
                                                        "TF_REATTACH_PROVIDERS" (-> server-opts
                                                                                    json/generate-string)}}
                          ::run/cmds [#_"tofu init" "tofu plan"]
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

    (defn start-proxy
      [opts]
      (ok opts))
    (defn stop-proxy
      [opts]
      (ok opts))
    (def dev-wf (->workflow {:first-step ::start
                             :wire-fn (fn [step step-fns]
                                        (case step
                                          ::start [start ::prepare]
                                          ::start-proxy [start-proxy ::prepare]
                                          ::prepare [prepare ::render]
                                          ::render [render/render ::exec]
                                          ::exec [(partial run/run-cmds step-fns) ::end]
                                          ::stop-proxy [stop-proxy ::stop-real]
                                          ::end [stop]))}))
    (into (sorted-map) (dev-wf {::bc/env :repl}))))

(def main-wf (->workflow {:first-step ::start
                          :wire-fn (fn [step _]
                                     (case step
                                       ::start [start ::end]
                                       ::end [identity]))}))

(comment
  (into (sorted-map) (main-wf {::block true
                               ::bc/env :repl})))
