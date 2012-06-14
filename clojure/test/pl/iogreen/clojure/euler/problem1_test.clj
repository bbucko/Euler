(ns pl.iogreen.clojure.euler.problem1_test
  (:use clojure.test
        pl.iogreen.clojure.euler.problem1))

(deftest simple-test
  (testing "Test example values (for n = 10 answer should be 23)"
    (is (= 23 (solver 10)))))

(deftest resolver-test
  (testing "Resolve for n=1000"
    (is (= 233168 (solver 1000)))))