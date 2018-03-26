(ns ejercicios.exercise3)

(def filtrar filter)


(defn fibo [arg1 arg2 arg3 cant_terminos]
  (if (= arg3 cant_terminos)

      (+ arg1 arg2)

      (fibo (+ arg1 arg2) arg1 (inc arg3) cant_terminos)))



(defn fibonacci [x]
  (if (= x 0)
      0
      (fibo 0 1 1 x)))
