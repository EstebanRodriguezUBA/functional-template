(ns ejercicios.exercise10
 (:require [ejercicios.exercise6 :refer :all]
           [ejercicios.exercise4 :refer :all]))
;;se requiere summary y se requiere faverage de otros ejercicios

(def sumatoria summary)

(def promedio faverage)

(defn squear
  "Returns the squear of a given number"
  [x]
  (
    * x x))


(defn fvariance [coleccion]
  ;;varianza = (1/n (sumatoria (Xi)² )) - (promedio)²
  ;; dada una muestra de valores n.
  (- (/ (sumatoria(map squear coleccion)) (contar coleccion))              (squear(promedio coleccion))))
