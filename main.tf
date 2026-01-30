# terraform {
#   required_providers {
#     bigconfig = {
#       source = "registry.terraform.io/amiorin/bigconfig"
#     }
#   }
# }

# resource "bigconfig_rama" "node1" {
# }

# Tell terraform to use the provider and select a version.
terraform {
  backend "s3" {
    bucket = "tf-state-251213589273-eu-west-1"
    key    = "alpha.tfstate"
    region = "eu-west-1"
  }

  required_providers {
    hcloud = {
      source  = "registry.terraform.io/hetznercloud/hcloud"
      version = "~> 1.45"
    }
  }
}

# Set the variable value in *.tfvars file
# or using the -var="hcloud_token=..." CLI option
variable "hcloud_token" {
  sensitive = true
}

# Configure the Hetzner Cloud Provider
provider "hcloud" {
  token = var.hcloud_token
}
