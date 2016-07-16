(set-env!
 :source-paths #{"src"}
 :dependencies '[[org.clojure/clojure "1.9.0-alpha10"]
                 [com.stuartsierra/component "0.3.1"]
                 [org.danielsz/system "0.3.0" :scope "test"]])

(require '[system.boot :refer [system]]
         '[demo.core :as c])

(defn sys [] (c/sys))

(deftask dev-sys []
  (comp (watch)
        (system :sys #'sys
                :files ["core.clj"]
                :auto true)))