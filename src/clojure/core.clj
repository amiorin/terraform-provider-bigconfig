(ns core
  (:require
   [cheshire.core :as json]
   [clojure.java.io :as io]
   [server]))

(defn -main [& args]
  (apply server/-main args))

(comment
  (-> (with-open [r (io/reader "schema.json")]
        (json/parse-stream r true))
      :provider_schemas
      (get "registry.terraform.io/hashicorp/null")
      :resource_schemas
      :null_resource
      :block)

  (-> (with-open [r (io/reader "provider_schema.json")]
        (json/parse-stream r true))
      keys))
