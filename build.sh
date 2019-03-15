#!/bin/bash
#set -x
set -eo pipefail
shopt -s nullglob
echo "$(tput setaf "2")" "repackaging..." "$(tput sgr0)"

if [ -n "`docker images -f "dangling=true" -q`" ]
 then
docker rmi $(docker images -f "dangling=true" -q)
 fi
docker-compose -f docker-infrastructure.yml  up -d
mvn clean package -Dmaven.test.skip=true
docker-compose -f docker-business.yml build
docker-compose -f docker-business.yml  up -d


