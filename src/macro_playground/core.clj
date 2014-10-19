(ns macro-playground.core
  (:gen-class))

;; Adapted from
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
         w 604800
         ms 1/1000
         us 1/1000000)))

;; How would I produce a version that could handle a call like this?:
;; (unit-of-time 5 d 1 h 3 s)
;; Multi-arity macros are reportedly possible, but neither brave nor true
;; So what's good?

(defn -main
  "I don't do a whole lot ... yet."
  [& args])
