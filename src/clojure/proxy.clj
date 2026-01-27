(ns proxy
  (:import (com.terraform.plugin.v6
            ProviderGrpc
            ProviderGrpc$ProviderImplBase
            StopProvider$Response)
           (io.grpc ManagedChannel)))

(defn create-proxy-provider-service [^ManagedChannel real-channel]
  (let [real-provider (ProviderGrpc/newStub real-channel)]
    (proxy [ProviderGrpc$ProviderImplBase] []
      (getProviderSchema [this request observer]
        (.getProviderSchema real-provider request observer))
      (validateProviderConfig [this request observer]
        (.validateProviderConfig real-provider request observer))
      (validateResourceConfig [this request observer]
        (.validateResourceConfig real-provider request observer))
      (validateDataResourceConfig [this request observer]
        (.validateDataResourceConfig real-provider request observer))
      (upgradeResourceState [this request observer]
        (.upgradeResourceState real-provider request observer))
      (configureProvider [this request observer]
        (.configureProvider real-provider request observer))
      (readResource [this request observer]
        (.readResource real-provider request observer))
      (planResourceChange [this request observer]
        (.planResourceChange real-provider request observer))
      (applyResourceChange [this request observer]
        (.applyResourceChange real-provider request observer))
      (importResourceState [this request observer]
        (.importResourceState real-provider request observer))
      (readDataSource [this request observer]
        (.readDataSource real-provider request observer))
      (stopProvider [this request observer]
        (.stopProvider real-provider request observer)))))
