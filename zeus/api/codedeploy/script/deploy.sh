#!/bin/bash
aws ecr get-login-password --region AWS_REGION | docker login --username AWS --password-stdin AWS_ECR_REGISTRY
aws ssm get-parameters-by-path --path "/" --region ap-northeast-1 --output text | awk '{print $5"="$7}' > /home/ec2-user/.env

docker pull AWS_ECR_REGISTRY/AWS_ECR_REPOSITORY:latest
docker container stop zeus-api | true
docker container rm zeus-api | true
docker run -d -p8080:8080 --name zeus-api --env-file "/home/ec2-user/.env" AWS_ECR_REGISTRY/AWS_ECR_REPOSITORY:latest
docker rmi `docker image ls | grep none | awk '{print $3}'` | true
