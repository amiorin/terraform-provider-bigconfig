(ns proxy
  (:import (com.terraform.plugin.v6
            ProviderGrpc
            ProviderGrpc$ProviderImplBase)
           (io.grpc ManagedChannel)))

(declare ->provider-proxy)

(defn ->proxy-provider-service [^ManagedChannel real-channel]
  (let [real-provider (ProviderGrpc/newStub real-channel)]
    (->provider-proxy ProviderGrpc$ProviderImplBase real-provider)))

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
                                (tap> [(keyword ~m-name) [request# observer#]])
                                (~(symbol (str "." m-name)) ~provider request# observer#)))))))

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

