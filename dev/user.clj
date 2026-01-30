(ns user
  (:require
   [pronto.core :as pr])
  (:import (com.terraform.plugin.v6
            GetProviderSchema$Response)))

(defonce debug-atom (atom []))
(defn add-to-debug [x]
  (swap! debug-atom conj x))
(add-tap add-to-debug)

(comment
  (pr/defmapper my-mapper [GetProviderSchema$Response])

  (reset! debug-atom [])
  (-> @debug-atom
      second
      second))
