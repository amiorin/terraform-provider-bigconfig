Attempt to create a terraform provider in Clojure for BigConfig.

# Changelog

All notable changes to this project will be documented in this file.

The format is based on [Keep a Changelog](https://keepachangelog.com/en/1.1.0/),
and this project adheres to [Semantic Versioning](https://semver.org/spec/v2.0.0.html).

The patch number is calculated with `git rev-list --count HEAD`

## [Unreleased] - 2026-01-31

### Added

- `big-config` to manage workflows.
- `proxy-wf` intercept the traffic between Terraform and a Terraform provider written in Go. The plan is to use it also for development and testing. The steps are:
  - it starts the any Terraform provider in `debug` mode.
  - it starts the `proxy` provider that intercept the traffic.
  - it renders a main.tf.
  - it runs `tofu plan`.
  - it cleans up everyting.
  - it derefs all the responses because gRPC is async.
- `deps.edn` because of the Git dependency.

## [Unreleased] - 2026-01-26

### Added 

- Fast development loop added. In emacs is possible to change the code of the Grpc service, reload the service, and run `tofu plan` to see the result with one keystroke.
- Adopt the official grpc-java. All the other libraries in Clojure looked abondoned.
- Clojure pronto to convert Clojure maps to protobuf. A thin layer to avoid to use the generated Java classes directly.
- Buf to compile the proto file to Java classes.
- Babashka doesn't work because it cannot load the generated Java classes.

# Notes

``` sh
devenv shell --impure
```

```sh
buf curl --schema ./proto \
  --cert certs/client-cert.pem \
  --key certs/client-key.pem \
  --unix-socket /tmp/tf-provider.sock \
  --protocol grpc \
  --insecure \
  https://localhost/tfplugin6.Provider/GetMetadata

buf curl --schema ./proto \
  --unix-socket /var/folders/r4/w6487z_x3jq6fzwt1w2k1v540000gn/T/plugin1725000220 \
  --protocol grpc \
  --http2-prior-knowledge \
  http://localhost/tfplugin6.Provider/GetMetadata

buf curl --schema ./proto \
  --unix-socket /var/folders/r4/w6487z_x3jq6fzwt1w2k1v540000gn/T/plugin1145296340 \
  --protocol grpc \
  --http2-prior-knowledge \
  http://localhost/tfplugin6.Provider/GetProviderSchema
```

# Links
- https://github.com/andfadeev/clojure-grpc-server
- https://github.com/bufbuild/buf                                                       
- https://www.youtube.com/watch?v=TYPKCjGBLyY                                           
- https://github.com/provide-io                                                         
- https://github.com/smheidrich/non-go-terraform-provider-assessment                    
- https://github.com/rpcplugin/spec/blob/master/rpcplugin-spec.md                       
- https://developer.hashicorp.com/terraform/plugin/terraform-plugin-protocol            
- https://search.opentofu.org/docs/providers/creating                                   
- https://github.com/hashicorp/terraform/blob/main/docs/plugin-protocol/tfplugin6.proto 
- https://github.com/s-expresso/clojobuf                                                
- https://github.com/AppsFlyer/pronto                                                   
- https://github.com/AppsFlyer/lein-protodeps                                           
- https://protojure.readthedocs.io/en/latest/                                           
- https://github.com/otwieracz/clj-grpc                                                 
- https://github.com/fourteatoo/protobluff                                              
- https://blog.jmibanez.com/2018/07/22/grpc-with-clojure-and-leiningen.html             
- https://github.com/aphyr/less-awful-ssl                                               

# Msgpack
- https://github.com/julienvincent/msgpack-clj
- https://github.com/edma2/clojure-msgpack
- https://github.com/rosejn/msgpack-cljc
- https://github.com/pkcsecurity/msgpack-cljs
