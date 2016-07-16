(ns demo.core
  (:require [com.stuartsierra.component :as component]))

(defrecord MyComponent []
  component/Lifecycle
  (start [c] (prn "Starting MyComponent") c)
  (stop [c] (prn "Stopping MyComponent") c))

(defn sys []
  (prn "Creating new system")
  (component/system-map
   :comp     (->MyComponent)))