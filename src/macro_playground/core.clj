(ns macro-playground.core
  (:gen-class))

;; http://letoverlambda.com/index.cl/guest/chap3.html#sec_2
(defmacro unit-of-time
  "Produces a unit of time in seconds, given a VALUE and a UNIT."
  [value unit]
  `(* ~value
      ~(case unit
         s 1
         m 60
         h 3600
         d 86400
         ms 1/1000
         us 1/1000000)))

(defn -main
  "I don't do a whole lot ... yet."
  [& args])
