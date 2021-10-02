#!/bin/bash

INFRA="dev"
PROJECT_DIRECTORY="/home/ubuntu/app"

# server
if [ "$DEPLOYMENT_GROUP_NAME" == "block-server-deploy-group-dev" ]
then
    INFRA="dev"
    docker-compose -f "$PROJECT_DIRECTORY/scripts/docker-compose.server.yaml" --project-directory "$PROJECT_DIRECTORY" kill

elif [ "$DEPLOYMENT_GROUP_NAME" == "block-server-deploy-group-staging" ]
then
    INFRA="staging"
    docker-compose -f "$PROJECT_DIRECTORY/scripts/docker-compose.server.yaml" --project-directory "$PROJECT_DIRECTORY" kill

elif [ "$DEPLOYMENT_GROUP_NAME" == "block-server-deploy-group-prod" ]
then
    INFRA="prod"
    docker-compose -f "$PROJECT_DIRECTORY/scripts/docker-compose.server.yaml" --project-directory "$PROJECT_DIRECTORY" kill


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
