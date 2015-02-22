(ns foreclojure.core)

; Rotate Sequence

; Write a function which can rotate a sequence in either direction.

(defn rs [n xs]
  (let [sz (count xs)
        dn (+ sz (rem n sz))]
    (take sz (drop dn (cycle xs)))))

(= (rs 2 [1 2 3 4 5]) '(3 4 5 1 2))

(= (rs -2 [1 2 3 4 5]) '(4 5 1 2 3))

(= (rs 6 [1 2 3 4 5]) '(2 3 4 5 1))

(= (rs 1 '(:a :b :c)) '(:b :c :a))

(= (rs -4 '(:a :b :c)) '(:c :a :b))
