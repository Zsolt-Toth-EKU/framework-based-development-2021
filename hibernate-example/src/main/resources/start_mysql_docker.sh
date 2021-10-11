#!/usr/bin/env bash

docker run \
 --rm \
 --name mysql \
 --publish 3306:3306 \
 --env MYSQL_DATABASE=basketball \
 --env MYSQL_ROOT_PASSWORD=secret \
 --volume $(pwd)/basketball_women_dump.sql:/docker-entrypoint-initdb.d/basketball.sql \
 mysql:8