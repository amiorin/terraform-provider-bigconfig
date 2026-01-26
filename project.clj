(defproject terraform-provider-big-config "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.12.3"]
                 [io.grpc/grpc-netty "1.78.0"]
                 [io.grpc/grpc-stub "1.78.0"]
                 [io.grpc/grpc-protobuf "1.78.0"]
                 [io.grpc/grpc-services "1.78.0"]
                 [io.netty/netty-transport-native-kqueue "4.1.100.Final" :classifier "osx-aarch_64"]
                 [io.netty/netty-transport-native-epoll "4.1.100.Final" :classifier "linux-x86_64"]
                 [io.netty/netty-transport-native-epoll "4.1.100.Final" :classifier "linux-aarch_64"]
                 [io.netty/netty-tcnative-boringssl-static "2.0.61.Final"]
                 [com.google.protobuf/protobuf-java "4.33.4"]
                 [javax.annotation/javax.annotation-api "1.3.2"]
                 [cheshire "6.1.0"]
                 [babashka/process "0.6.25"]

                 ;; testing
                 [org.wiremock/wiremock-standalone "3.13.2"]
                 [org.wiremock/wiremock-grpc-extension "0.11.0"]]
  :plugins [[lein-ancient "1.0.0-RC3"]]
  :main ^:skip-aot core
  :target-path "target/%s"
  :source-paths ["src/clojure"]
  :java-source-paths ["gen/java"]
  :profiles {:uberjar {:aot :all
                       :jvm-opts ["-Dclojure.compiler.direct-linking=true"]}})
