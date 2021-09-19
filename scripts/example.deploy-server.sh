#!/bin/sh

# $INFRA : prod, staging, dev 셋 중 하나

echo "> Login to ECR"

aws ecr-public get-login-password --region ap-northeast-2 | docker login --username AWS --password-stdin public.ecr.aws/b1b4k6o9

echo "> Stopping container"

docker-compose kill

echo "> Starting image"

docker-compose --env-file ./.env.$INFRA up -d 