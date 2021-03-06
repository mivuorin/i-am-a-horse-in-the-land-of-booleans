(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (if x true false))

(defn abs [x]
  (if (> x 0)
    x
    (* -1 x)))

(defn divides? [divisor n]
  (== (mod n divisor) 0))

(defn fizz? [n]
  (== (mod n 3) 0))

(defn buzz? [n]
  (== (mod n 5) 0))

(defn fizzbuzz [n]
  (cond
   (and (fizz? n) (buzz? n)) "gotcha!"
   (fizz? n) "fizz"
   (buzz? n) "buzz"
   :else ""))

(defn teen? [age]
  (<= 13 age 19))

(defn not-teen? [age]
  (not (teen? age)))

(defn generic-doublificate [x]
  (cond
   (number? x) (* x 2)
   (empty? x) nil
   (list? x) (* (count x) 2)
   (vector? x) (* (count x) 2)
   :else true))

(defn leap-year? [year]
  (if (divides? 4 year)
    (if (divides? 100 year)
      (if (divides? 400 year)
        true
        false)
      true)
    false))

; '_______'

