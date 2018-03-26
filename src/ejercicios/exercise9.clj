(ns ejercicios.exercise9)

(defn things
  [params]

  (cond
    (= (type "") (type params))   "Soy un String"
    (= (type {}) (type params))   "Soy un Map"
    (= (type []) (type params))   "Soy un Vector"
    (= (type  0) (type params))   "Soy un default"
    :else "Soy otra cosa"))
