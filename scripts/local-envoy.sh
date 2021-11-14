#!/bin/sh

docker-compose --env-file .env.local -f docker-compose.envoy.local.yaml up -d 