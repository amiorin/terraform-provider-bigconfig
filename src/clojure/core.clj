(ns core
  (:gen-class)
  (:require
   [server :as server]))

(defn -main [& _]
  (server/main-wf {::server/block true}))
