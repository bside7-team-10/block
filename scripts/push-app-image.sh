#!/bin/sh

echo "> Login to ECR"

aws ecr-public get-login-password --region ap-northeast-2 | docker login --username AWS --password-stdin public.ecr.aws/b1b4k6o9

INFRA=dev

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