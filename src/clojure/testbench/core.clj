(ns testbench.core)

(defn foo
  "Use class from Java"
  [n]
  (def sample (testbench.Sample. "hello"))
  (println (.getName sample)))

(defn -main [& args]
  (println "Welcome to Clojure/Java mix project, args: " args)
  (foo 1))
