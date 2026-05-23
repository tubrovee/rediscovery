### Terraform examples

This repo contains two minimal Terraform examples:

- **local**: No cloud credentials required. Writes a local file.
- **aws**: Provisions a minimal S3 bucket.

#### Prerequisites
- Terraform >= 1.4
- For AWS example: AWS credentials configured (e.g., via environment or `~/.aws`)

#### local example
```bash
cd local
terraform init
terraform plan
terraform apply -auto-approve
cat hello.txt
```
To customize:
- `var.output_path`: path of the generated file
- `var.message_prefix`: prefix of the content

#### aws example (S3 bucket)
```bash
cd aws
cp terraform.tfvars.example terraform.tfvars  # edit values
terraform init
terraform plan
terraform apply -auto-approve
```
Variables:
- `region`: AWS region (default `us-east-1`)
- `bucket_name`: globally unique S3 bucket name
- `enable_versioning`: enable/disable versioning (default `true`)
- `tags`: map of tags

Destroy resources when done:
```bash
terraform destroy
```