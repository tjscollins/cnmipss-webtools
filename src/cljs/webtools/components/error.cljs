(ns webtools.components.error
  (:require [clojure.string :as cstr ]
            [re-frame.core :as rf]))

(defn reporter
  "Returns a component that reports errors to the user"
  []
  (if-let [error @(rf/subscribe [:error])]
    [:p#err-msg.slow-fade {:style {:color "red"}}
     (str "Error: " (cstr/replace error "+" " "))]))
