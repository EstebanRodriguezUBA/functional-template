(ns ejercicios.exercise6
 (:require [ejercicios.exercise4 :refer :all]))


(def contar count)
(defn faverage [x]
  (if (empty? x)
    x
    (/ (summary x) (contar x))))
