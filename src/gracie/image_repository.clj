(ns gracie.image-repository
  (:require [com.stuartsierra.component :as component]))

(declare lookup-images all-images)

(defrecord ImageRepository [subject]
  component/Lifecycle
  (start [this]
    (assoc this :subject subject))
  (stop  [this] this))

(defn new-image-repository [& {:as opts}]
  (-> opts
      map->ImageRepository))


;; Component Functions
(defn lookup-images [{:keys (subject)}]
  (get {"as-kitten" ["http://localhost:3000/static/gracie3.jpg"
                     "http://localhost:3000/static/gracie.jpg"
                    ; "http://localhost:3000/static/gracie4.jpg"
                     "http://localhost:3000/static/gracie2.jpg"]}
       subject []))

(def all-images (memoize lookup-images))


;; REPL Utilities
(defmacro when-system [system & forms]
  `(when (resolve ~system)
     (eval '(do ~@forms))))

(when-system 'dev/system
 (all-images (-> dev/system :kitten-pictures)))
