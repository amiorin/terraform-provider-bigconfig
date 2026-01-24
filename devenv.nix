{ pkgs, lib, config, inputs, ... }:

{
  languages.clojure.enable = true;
  languages.ansible.enable = true;
  languages.opentofu.enable = true;
  languages.terraform.enable = true;
  packages = [
    pkgs.leiningen
    pkgs.protobuf
    pkgs.buf
    pkgs.jet
  ];
}
