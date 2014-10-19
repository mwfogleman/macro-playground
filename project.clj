(defproject macro-playground "0.1.0-SNAPSHOT"
  :description "I want to play with macros!"
  :url "http://github.com/mwfogleman/macro-playground"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.6.0"]]
  :main ^:skip-aot macro-playground.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}
             :dev
             {:dependencies [[midje "1.6.3"]]}})
