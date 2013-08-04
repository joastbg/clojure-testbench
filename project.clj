(defproject clojure-dbs "0.1.0-SNAPSHOT"
  :description "Test bench for Clojure and related technologies"
  :url "http://www.gecemmo.com/"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :source-paths      ["src/clojure"]
  :java-source-paths ["src/java"]
  :javac-options     ["-target" "1.7" "-source" "1.7"]
  :plugins [[lein-ring "0.8.6"]
    [lein2-eclipse "2.0.0"]]
  :dependencies 
  	[[org.clojure/clojure "1.5.1"]
  	[org.clojure/clojure-contrib "1.2.0"]
  	[ring/ring-jetty-adapter "0.2.5"]
    [ring/ring-json "0.2.0"]
    [ring-json-params "0.1.0"]
    [compojure "0.4.0"]
	  [hiccup "1.0.4"]
    [com.datomic/datomic-free "0.8.4020.24"]
    [datomico "0.2.0"]
    [clojurewerkz/neocons "1.1.0"]
    [com.novemberain/monger "1.6.0"]
    [org.clojure/java.jdbc "0.3.0-alpha4"]
    [postgresql/postgresql "9.0-801.jdbc4"]
    [clj-json "0.2.0"]]
  :main testbench.core
  :dev-dependencies [[lein-ring "0.8.6"]])
