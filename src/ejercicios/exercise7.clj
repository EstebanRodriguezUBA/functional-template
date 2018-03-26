(ns ejercicios.exercise7)

(defn remap
 "retorna una funcion a la que se le pasa como argumento
 otra funcion, por ejemplo inc.
 Internamente tiene implementada una funcion que recibe pares clave/valor,
 y le aplica la funcion pasada por argumento (ej, inc). Si se trata de un hash-map con la funcion 'map', va aplicando a cada par clave/valor. Pero retorna un vector de pares de vectores clave/valor. Entonces con into se reconvierte en hash-map. "
    [funcionAplicada]
    #(into {} (map
               (fn [[k v]] [k (funcionAplicada v)])
               %)))



(defn fmap
  [funcion coleccion]
  "Si es un mapa aplicar remap sino error."
  (if (= (type {}) (type coleccion))
    ;;  nil
      ((remap funcion) coleccion)
      (map funcion coleccion)))
