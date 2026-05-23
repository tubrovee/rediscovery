resource "aws_s3_bucket" "this" {
  bucket = var.bucket_name

  tags = var.tags
}

resource "aws_s3_bucket_versioning" "this" {
  bucket = aws_s3_bucket.this.id
  versioning_configuration {
    status = var.enable_versioning ? "Enabled" : "Suspended"
  }
}

output "bucket_arn" {
  value       = aws_s3_bucket.this.arn
  description = "ARN of S3 bucket"
}

output "bucket_name" {
  value       = aws_s3_bucket.this.bucket
  description = "Name of S3 bucket"
}