(ns server
  (:require
   [babashka.fs :as fs]
   [babashka.process :as p]
   [big-config :as bc]
   [big-config.core :refer [->workflow ok]]
   [big-config.render :as render]
   [big-config.run :as run]
   [cheshire.core :as json]
   [clojure.java.io :as io]
   [clojure.string :as str]
   [com.rpl.specter :as s]
   [msgpack.core :refer [unpack]]
   [pronto.core :as pr])
  (:import
   [com.google.protobuf ByteString]
   (com.terraform.plugin.v6
    ConfigureProvider$Request
    ConfigureProvider$Response
    DynamicValue
    GetProviderSchema$Request
    GetProviderSchema$Response
    PlanResourceChange$Request
    PlanResourceChange$Response
    ProviderGrpc
    ProviderGrpc$ProviderImplBase
    Schema$Attribute
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

(pr/defmapper internal-mapper [Schema$Attribute])

;; "string"
;; :string
;; "number"
;; :number
;; "bool"
;; :bool
;; ["map","string"]
;; [:map :string]
;; ["set","string"]
;; [:set :string]
;; ["list","string"]
;; [:list :string]
;; ["list",["object",{"type":"string"}]]
;; [:list [object {:type :string}]]
;; ["list",["object",{"delete_protection":"bool","description":"string","home_location":"string","id":"number","ip_address":"string","ip_network":"string","labels":["map","string"],"name":"string","server_id":"number","type":"string"}]]
;; [:list [:object {:delete_protection :bool :description :string :labels [:map :string]}]]
;; ["list",["object",{"algorithm":["list",["object",{"type":"string"}]],"delete_protection":"bool","id":"number","ipv4":"string","ipv6":"string","labels":["map","string"],"load_balancer_type":"string","location":"string","name":"string","network_id":"number","network_ip":"string","network_zone":"string","service":["list",["object",{"destination_port":"number","health_check":["list",["object",{"http":["list",["object",{"domain":"string","path":"string","response":"string","status_codes":["list","number"],"tls":"bool"}]],"interval":"number","port":"number","protocol":"string","retries":"number","timeout":"number"}]],"http":["list",["object",{"certificates":["list","string"],"cookie_lifetime":"number","cookie_name":"string","redirect_http":"bool","sticky_sessions":"bool"}]],"listen_port":"number","protocol":"string","proxyprotocol":"bool"}]],"target":["list",["object",{"label_selector":"string","server_id":"number","type":"string"}]]}]]
;; [:list [:object {:algorithm [:list [:object {:type :string}]] :delete_protection :bool}]]

(defn byte-string->tf-type [^ByteString tf-type]
  (-> tf-type
      .toByteArray
      io/reader
      (json/parse-stream true)
      (->> (s/transform (s/walker string?) keyword))))

(defn tf-type->byte-string [tf-type]
  (-> tf-type
      json/generate-string
      ByteString/copyFromUtf8))

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
                               ServerCapabilities]
  :encoders {Schema$Attribute
             {:from-proto (fn [attribute]
                            (->> (into {} (pr/proto->proto-map internal-mapper attribute))
                                 (s/transform [:type] byte-string->tf-type)))
              :to-proto (fn [attribute]
                          (->> attribute
                               (s/transform [:type] tf-type->byte-string)
                               (pr/clj-map->proto-map internal-mapper Schema$Attribute)
                               (pr/proto-map->proto)))}

             DynamicValue
             {:from-proto (fn [^DynamicValue dynamic-value]
                            {:msgpack (-> (.getMsgpack dynamic-value)
                                          .toByteArray
                                          unpack)
                             :json (-> (.getJson dynamic-value)
                                       .toByteArray
                                       io/reader
                                       (json/parse-stream true))})
              :to-proto identity}})

(defn- proto->map [request observer response-fn]
  (let [response-class (-> (.getName (class request))
                           (str/replace "$Request" "$Response")
                           Class/forName)
        request-map (pr/proto->proto-map provider-mapper request)
        response (->> (response-fn request-map)
                      (pr/clj-map->proto-map provider-mapper response-class)
                      pr/proto-map->proto)]
    (doto observer
      (.onNext response)
      (.onCompleted))))

(defmacro grpc-proxy [service ctor & overrides]
  `(proxy [~service] ~ctor
     ~@(for [[method args & body] overrides]
         `(~method [request# observer#]
                   (proto->map request# observer# (fn ~args ~@body))))))

(def provider-service
  (grpc-proxy ProviderGrpc$ProviderImplBase []
    (planResourceChange [request] {})
    (configureProvider [request] {})
    (validateProviderConfig [request] {})
    (validateResourceConfig [request] {})
    (getProviderSchema [request] {:provider {:block {}}
                                  :resource_schemas {"bigconfig_rama" {:block {}}}})))

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
        server (create-server provider-service socket-path)
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

(defn prepare [{:keys [::servers ::test-name] :as opts}]
  (when-not (seq servers)
    (throw (IllegalArgumentException. "::servers should never be empty")))
  (when (nil? test-name)
    (throw (IllegalArgumentException. "::test-name should never be nil")))
  (let [server-opts (-> servers
                        last
                        :opts)
        dir (format "tests/%s" test-name)
        target-dir (format ".dist/%s" dir)]
    (merge opts (ok) {::run/shell-opts {:dir target-dir
                                        :out *err*
                                        :err *err*
                                        :extra-env {"TF_LOG" #_"TRACE" "ERROR"
                                                    "TF_REATTACH_PROVIDERS" (-> server-opts
                                                                                json/generate-string)}}
                      ::run/cmds [#_"tofu init" "tofu plan"]
                      ::render/templates [{:template dir
                                           :overwrite true
                                           :target-dir target-dir
                                           :transform [["."
                                                        :raw]]}]})))

(defn stop [{:keys [::servers ::channels ::processes] :as opts}]
  (->> processes
       (remove nil?)
       (run! #(p/destroy %1)))
  (->> channels
       (remove nil?)
       (run! #(.shutdown %1)))
  (->> servers
       (map :server)
       (remove nil?)
       (run! #(.shutdown %1)))
  opts)

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

(defmacro proxy-service-macro [service stub tap-fn]
  (let [methods (.getMethods (resolve service))
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
           `(~(symbol method-name) [request# observer#]
                                   (let [proxy-observer# (->proxy-observer observer#)]
                                     (~tap-fn (keyword ~method-name)
                                              (pr/proto->proto-map provider-mapper request#)
                                              proxy-observer#)
                                     (~(symbol (str "." method-name)) ~stub request# proxy-observer#)))))))

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
        channel (socket->grpc-channel prev-socket-path)
        service (->proxy-service channel (fn [& xs] (swap! messages conj xs)))
        server (create-server service socket-path)
        server-opts {provider-name {:Protocol "grpc"
                                    :ProtocolVersion 6
                                    :Pid (.pid (java.lang.ProcessHandle/current))
                                    :Test true
                                    :Addr {:Network "unix"
                                           :String socket-path}}}]
    (.start server)
    (-> (merge opts (ok) {::messages messages})
        (update ::channels (fnil conj []) channel)
        (update ::servers (fnil conj []) {:proxy true
                                          :provider-name provider-name
                                          :socket-path socket-path
                                          :server server
                                          :opts server-opts}))))

(defn fix-messages [{:keys [::messages] :as opts}]
  (let [messages (-> messages
                     deref
                     (->> (mapv (fn [[procedure request response]]
                                  [procedure request (-> @response
                                                         :values
                                                         first)]))))]
    (merge opts (ok) {::messages (atom messages)})))

(defn start-and-grep [cmd regex]
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

(defn start-hcloud [opts]
  (let [var-name "TF_VAR_hcloud_token"
        value (System/getenv var-name)]
    (when (str/blank? value)
      (throw (ex-info (str "Missing required environment variable: " var-name)
                      opts))))
  (let [[proc line] (start-and-grep ".bin/terraform-provider-hcloud_v1.59.0 -debug" #"TF_REATTACH_PROVIDERS='.*'")
        provider-name "registry.terraform.io/hetznercloud/hcloud"
        server-opts (-> (second (re-find #"='(.*)'" line))
                        (json/parse-string))
        socket-path (get-in server-opts [provider-name "Addr" "String"])]

    (-> (ok opts)
        (update ::processes (fnil conj []) proc)
        (update ::servers (fnil conj []) {:proxy false
                                          :provider-name provider-name
                                          :socket-path socket-path
                                          :server nil
                                          :opts server-opts}))))

(def dev-wf (->workflow {:first-step ::start
                         :wire-fn (fn [step step-fns]
                                    (case step
                                      ::start [start ::start-proxy]
                                      ::start-proxy [start-proxy ::prepare]
                                      ::prepare [prepare ::render]
                                      ::render [render/render ::exec]
                                      ::exec [(partial run/run-cmds step-fns) ::fix-messages]
                                      ::fix-messages [fix-messages ::end]
                                      ::end [stop]))}))

(comment
  (do
    (require '[user :as u])
    (reset! u/debug-atom [])
    (into (sorted-map) (dev-wf {::bc/env :repl
                                ::test-name "first"}))
    #_(-> @u/debug-atom)))

(def hcloud-wf (->workflow {:first-step ::start
                            :wire-fn (fn [step step-fns]
                                       (case step
                                         ::start [start-hcloud ::start-proxy]
                                         ::start-proxy [start-proxy ::prepare]
                                         ::prepare [prepare ::render]
                                         ::render [render/render ::exec]
                                         ::exec [(partial run/run-cmds step-fns) ::fix-messages]
                                         ::fix-messages [fix-messages ::end]
                                         ::end [stop]))}))

(comment
  (do
    (defn process [v]
      (binding [*out* *err*]
        #_(println (class v))
        (when (map? v)
          (println (class v)))))
    (->> (into (sorted-map) (hcloud-wf {::bc/env :repl
                                        ::test-name "hcloud"}))
         #_(s/select-one [::messages s/ATOM s/FIRST (s/nthpath 2) :provider :block :attributes])
         (s/select-one [::messages s/ATOM])
         #_(s/transform [s/ALL s/MAP-VALS] #(doto % process)))))

(def main-wf (->workflow {:first-step ::start
                          :wire-fn (fn [step _]
                                     (case step
                                       ::start [start ::end]
                                       ::end [identity]))}))

(comment
  (into (sorted-map) (main-wf {::block true
                               ::bc/env :repl})))

(comment
  (def foo *1)
  (->> foo
       (s/select [s/ALL s/FIRST])
       #_(s/select [s/ALL #(= :planResourceChange (first %))])))
