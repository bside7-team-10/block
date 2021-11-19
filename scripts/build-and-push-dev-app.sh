#!/bin/sh

## Should run on root dir

docker build -t public.ecr.aws/b1b4k6o9/block-app:dev-latest -f ./front/Dockerfile .

aws ecr-public get-login-password --region us-east-1 | docker login --username AWS --password-stdin public.ecr.aws
docker push public.ecr.aws/b1b4k6o9/block-app:dev-latest