terraform {
  required_providers {
    bigconfig = {
      source = "registry.terraform.io/amiorin/bigconfig"
    }
  }
}

resource "bigconfig_rama" "node1" {
}
