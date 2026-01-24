(ns core
  (:require
   [clojure.java.io :as io]
   [cheshire.core :as json]
   [server]))

(defn -main [& args]
  (apply server/-main args))

(comment
  (-> (with-open [r (io/reader "schema.json")]
        (json/parse-stream r true))
      :provider_schemas
      :registry.terraform.io/hashicorp/null
      :resource_schemas
      :null_resource
      :block))
