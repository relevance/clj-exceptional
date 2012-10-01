(defproject clj-exceptional "0.7.2-SNAPSHOT"
  :description "Clojure client for Exceptional http://exceptional.io"
  :url "https://github.com/relevance/clj-exceptional"
  :dependencies [[cheshire "4.0.1"]
                 [clj-http "0.4.0"]]
  :profiles {:dev {:dependencies [[swank-clojure "1.2.0"]
                                  [lein-clojars "0.6.0"]]}})
