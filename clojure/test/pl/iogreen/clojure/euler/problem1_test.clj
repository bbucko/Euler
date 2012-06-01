(ns pl.iogreen.clojure.euler.problem1_test
  (:use clojure.test
        pl.iogreen.clojure.euler.problem1))

(deftest small-test
  (testing "Simple test"
    (is (= 3 (solver 3)))))