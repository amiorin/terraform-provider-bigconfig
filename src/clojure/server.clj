(ns server
  (:require
   [babashka.process :as p]
   [cheshire.core :as json]
   [clojure.java.io :as io]
   [pronto.core :as pr]
   [pronto.core :as pr])
  (:import
   (com.terraform.plugin.v6 GetProviderSchema$Response ProviderGrpc$ProviderImplBase ServerCapabilities)
   (io.grpc.netty NettyServerBuilder)
   (io.grpc.netty GrpcSslContexts)
   io.grpc.Status
   (io.netty.channel.epoll EpollEventLoopGroup EpollServerDomainSocketChannel)
   (io.netty.channel.kqueue KQueueEventLoopGroup KQueueServerDomainSocketChannel)
   (io.netty.channel.unix DomainSocketAddress)
   (io.netty.handler.ssl ClientAuth)
   (java.io File)))

(declare start-server)

(declare stop-server)

(defn- get-os []
  (let [os-name (System/getProperty "os.name" "generic")]
    (cond
      (.startsWith os-name "Mac OS X") :osx
      (.startsWith os-name "Linux") :linux
      :else :unsupported)))

(defonce server (atom nil))

(def socket-path "/tmp/tf-provider.sock")

(def data {"registry.terraform.io/amiorin/big-config" {:Protocol "grpc"
                                                       :ProtocolVersion 6
                                                       :Pid (.pid (java.lang.ProcessHandle/current))
                                                       :Test true
                                                       :Addr {:Network "unix"
                                                              :String socket-path}}})

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

(defn send-error!
  "Sends a gRPC INTERNAL error with a custom message."
  [observer msg]
  (let [ex (-> Status/INTERNAL
               (.withDescription (str msg))
               (.asRuntimeException))]
    (.onError observer ex)))

(comment
  (pr/clj-map->proto-map my-mapper GetProviderSchema$Response {:provider {}}))

(do
  (pr/defmapper my-mapper [GetProviderSchema$Response ServerCapabilities])
  (defn- create-provider-service []
    (proxy [ProviderGrpc$ProviderImplBase] []
      (getProviderSchema [request observer]
        #_(send-error! observer "getProviderSchema")
        (let [response (-> (pr/clj-map->proto-map my-mapper GetProviderSchema$Response {:provider {:block {}}})
                           pr/proto-map->proto)]
          (doto observer
            (.onNext response)
            (.onCompleted))))))
  (let [socket-file (File. socket-path)]
    (when (.exists socket-file)
      (.delete socket-file)))
  (future (start-server))
  (p/shell {:continue true
            :out *out*
            :err *err*
            :extra-env {"TF_LOG" "ERROR"
                        "TF_REATTACH_PROVIDERS" (json/generate-string data)}} "tofu plan")
  (stop-server))

(defn- create-server []
  (let [server-cert (io/file "certs/server-cert.pem")
        server-key (io/file "certs/server-key.pem")
        client-ca (io/file "certs/client-cert.pem")
        ssl-context (-> (GrpcSslContexts/forServer server-cert server-key)
                        (.trustManager client-ca)
                        (.clientAuth ClientAuth/REQUIRE)
                        (.build))
        provider-service (create-provider-service)]
    (-> (new-uds-builder socket-path)
        #_(.sslContext ssl-context)
        (.addService provider-service)
        (.build))))

(defn start-server []
  (let [s (create-server)]
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
    (reset! server nil)
    (println "Server stopped.")))

(defn -main [& _]
  (let [socket-file (File. socket-path)]
    (when (.exists socket-file)
      (.delete socket-file)))
  (.addShutdownHook (Runtime/getRuntime) (Thread. stop-server))
  (start-server))
