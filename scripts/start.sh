#!/bin/bash

INFRA="dev"

# server
if [ "$DEPLOYMENT_GROUP_NAME" == "block-server-deploy-group-dev"]
then
    INFRA="dev"
    docker pull public.ecr.aws/b1b4k6o9/block-server:$INFRA-latest
    docker-compose --env-file "scripts/.env.$INFRA" -f "scripts/docker-compose.server.yaml" --project-directory $(pwd) up -d 

elif [ "$DEPLOYMENT_GROUP_NAME" == "block-server-deploy-group-staging"]
then
    INFRA="staging"
    docker pull public.ecr.aws/b1b4k6o9/block-server:$INFRA-latest
    docker-compose --env-file "scripts/.env.$INFRA" -f "scripts/docker-compose.server.yaml" --project-directory $(pwd) up -d 

elif [ "$DEPLOYMENT_GROUP_NAME" == "block-server-deploy-group-prod"]
then
    INFRA="prod"
    docker pull public.ecr.aws/b1b4k6o9/block-server:$INFRA-latest
    docker-compose --env-file "scripts/.env.$INFRA" -f "scripts/docker-compose.server.yaml" --project-directory $(pwd) up -d 

# app - TODO
elif [ "$DEPLOYMENT_GROUP_NAME" == "block-app-deploy-group-dev"]
then
    INFRA="dev"
    docker pull public.ecr.aws/b1b4k6o9/block-app:$INFRA-latest
elif [ "$DEPLOYMENT_GROUP_NAME" == "block-app-deploy-group-staging"]
then
    INFRA="staging"
    docker pull public.ecr.aws/b1b4k6o9/block-app:$INFRA-latest
elif [ "$DEPLOYMENT_GROUP_NAME" == "block-app-deploy-group-prod"]
then
    INFRA="prod"
    docker pull public.ecr.aws/b1b4k6o9/block-app:$INFRA-latest
fi
