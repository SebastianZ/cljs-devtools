(ns devtools-sample.tests.issue24
  (:import [goog.date Date DateTime UtcDateTime])
  (:require-macros [devtools-sample.logging :refer [log info]])
  (:require [devtools-sample.boot :refer [boot!]]))

(boot! "/src/tests/devtools_sample/tests/issue24.cljs")

(enable-console-print!)

; --- MEAT STARTS HERE -->

(log false)
(log {:x false :y true})
(log [1 2 false true])
(log '(1 2 false true))
(log #{1 2 false true})

; <-- MEAT STOPS HERE ---
