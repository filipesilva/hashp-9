(ns test.hashp
  (:require [cljs.test :refer [deftest is]]
            ; [hashp.core :include-macros true]
            ))

(deftest hashp-test
  (is (= [1 2 3] #p [1 2 3])))