(ns pl.iogreen.clojure.euler.problem1)


(defn divisible-by-3? [num] (== (mod num 3) 0))
(defn divisible-by-5? [num] (== (mod num 5) 0))

(defn divisible-by-3-or-5? [num] (or (divisible-by-3? num) (divisible-by-5? num)))

(defn solver [n] (reduce + (filter divisible-by-3-or-5? (range n))))

