(ns ejercicios.exercise2)

(def filtrar filter)

(defn mayor-que-cinco? [x]
    (> x 5))

(defn only-greater-than-five [coll]
  "Filtrar los mayores que el numero 5."
  (filtrar mayor-que-cinco? coll))
