terraform {
  required_version = ">= 1.4.0"
  required_providers {
    local = {
      source  = "hashicorp/local"
      version = "~> 2.4"
    }
    random = {
      source  = "hashicorp/random"
      version = "~> 3.6"
    }
  }
}

variable "output_path" {
  description = "Path to write the hello file."
  type        = string
  default     = "hello.txt"
}

variable "message_prefix" {
  description = "Prefix for the message content."
  type        = string
  default     = "Hello from Terraform"
}

resource "random_pet" "this" {
  length    = 2
  separator = "-"
}

resource "local_file" "hello" {
  filename = var.output_path
  content  = "${var.message_prefix}, ${random_pet.this.id}!"
}

output "file_path" {
  value       = abspath(local_file.hello.filename)
  description = "Absolute path of generated file"
}

output "content" {
  value       = local_file.hello.content
  description = "Content written"
}