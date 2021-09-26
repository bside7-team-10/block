#!/bin/bash

BUILD_TAG="$(echo $TRAVIS_BRANCH | tr / -)-$TRAVIS_BUILD_NUMBER"

echo "> Login to ECR"

aws ecr-public get-login-password --region us-east-1 | docker login --username AWS --password-stdin public.ecr.aws

INFRA=dev

if ! [ "$TRAVIS_PULL_REQUEST" == "false" ]
then
    echo "Skip pushing image for pull request builds"
    exit 0
fi

if [ "$TRAVIS_BRANCH" == "develop" ]
then
    INFRA=dev
elif [ "$TRAVIS_BRANCH" == "master" ]
then
    INFRA=staging
elif [ "$TRAVIS_BRANCH" == "production" ]
then
    INFRA=prod
else
    exit 0 # Don't publish when not a branch listed above
fi

docker tag $APP_IMAGE:$BUILD_TAG $APP_IMAGE:$INFRA-latest
docker push $APP_IMAGE:$INFRA-latest

docker tag $APP_IMAGE:$BUILD_TAG $APP_IMAGE:latest
docker push $APP_IMAGE:latest