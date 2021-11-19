#!/bin/sh

docker-compose --env-file ./scripts/.env.dev -f ./scripts/docker-compose.server.yaml --project-directory /home/ubuntu/app kill server

docker pull public.ecr.aws/b1b4k6o9/block-server:dev-latest

docker-compose --env-file ./scripts/.env.dev -f ./scripts/docker-compose.server.yaml --project-directory /home/ubuntu/app up -d server
