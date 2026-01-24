(ns server
  (:require [clojure.java.io :as io])
  (:import (java.io File)
           (java.net StandardProtocolFamily)
           (java.nio.file Files)
           (java.nio.file.attribute FileAttribute)
           (io.grpc Server)
           (io.grpc.netty NettyServerBuilder)
           (io.netty.channel.epoll EpollEventLoopGroup EpollServerDomainSocketChannel)
           (io.netty.channel.kqueue KQueueEventLoopGroup KQueueServerDomainSocketChannel)
           (io.netty.channel.unix DomainSocketAddress)
           (io.grpc.netty GrpcSslContexts)
           (io.netty.handler.ssl SslContextBuilder ClientAuth)
           (com.terraform.plugin.v6 ProviderGrpc$ProviderImplBase)
           (com.terraform.plugin.v6 GetProviderSchema$Request GetProviderSchema$Response)
           (com.terraform.plugin.v6 Schema)))

(defn- get-os []
  (let [os-name (System/getProperty "os.name" "generic")]
    (cond
      (.startsWith os-name "Mac OS X") :osx
      (.startsWith os-name "Linux") :linux
      :else :unsupported)))

(defonce server (atom nil))

(def socket-path "/tmp/tf-provider.sock")

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

(defn- create-provider-service []
  (proxy [ProviderGrpc$ProviderImplBase] []
    (getProviderSchema [request observer]
      (let [response (-> (GetProviderSchema$Response/newBuilder)
                         (.setProvider (-> (Schema/newBuilder)
                                           (.setVersion 1)
                                           (.build)))
                         (.build))]
        (doto observer
          (.onNext response)
          (.onCompleted))))))

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
        (.sslContext ssl-context)
        (.addService provider-service)
        (.build))))

(defn start-server []
  (let [s (create-server)]
    (reset! server s)
    (.start s)
    (println "Server started, listening on" socket-path)
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
