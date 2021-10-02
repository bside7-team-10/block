#!/bin/bash

INFRA="dev"

# server
if [ "$DEPLOYMENT_GROUP_NAME" == "block-server-deploy-group-dev" ]
then
    INFRA="dev"
    docker-compose -f "scripts/docker-compose.server.yaml" --project-directory "$(pwd)" kill

elif [ "$DEPLOYMENT_GROUP_NAME" == "block-server-deploy-group-staging" ]
then
    INFRA="staging"
    docker-compose -f "scripts/docker-compose.server.yaml" --project-directory "$(pwd)" kill

elif [ "$DEPLOYMENT_GROUP_NAME" == "block-server-deploy-group-prod" ]
then
    INFRA="prod"
    docker-compose -f "scripts/docker-compose.server.yaml" --project-directory "$(pwd)" kill


# app - TODO
elif [ "$DEPLOYMENT_GROUP_NAME" == "block-app-deploy-group-dev" ]
then
    INFRA="dev"
elif [ "$DEPLOYMENT_GROUP_NAME" == "block-app-deploy-group-staging" ]
then
    INFRA="staging"
elif [ "$DEPLOYMENT_GROUP_NAME" == "block-app-deploy-group-prod" ]
then
    INFRA="prod"
fi
