#!/bin/sh

INFRA="dev"

# server
if [ "$DEPLOYMENT_GROUP_NAME" == "block-server-deploy-group-dev"]
then
    INFRA="dev"
    docker-compose --env-file "scripts/.env.$INFRA" -f "scripts/docker-compose.server.yaml" up -d 

elif [ "$DEPLOYMENT_GROUP_NAME" == "block-server-deploy-group-staging"]
then
    INFRA="staging"
    docker-compose --env-file "scripts/.env.$INFRA" -f "scripts/docker-compose.server.yaml" up -d 

elif [ "$DEPLOYMENT_GROUP_NAME" == "block-server-deploy-group-prod"]
then
    INFRA="prod"
    docker-compose --env-file "scripts/.env.$INFRA" -f "scripts/docker-compose.server.yaml" up -d 


# app - TODO
elif [ "$DEPLOYMENT_GROUP_NAME" == "block-app-deploy-group-dev"]
then
    INFRA="dev"
elif [ "$DEPLOYMENT_GROUP_NAME" == "block-app-deploy-group-staging"]
then
    INFRA="staging"
elif [ "$DEPLOYMENT_GROUP_NAME" == "block-app-deploy-group-prod"]
then
    INFRA="prod"
fi
