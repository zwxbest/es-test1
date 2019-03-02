#!/bin/bash
#set -x
set -eo pipefail
shopt -s nullglob

echo "$(tput setaf "2")" "repackaging..." "$(tput sgr0)"
mvn clean package

if [ -n "`docker images -f "dangling=true" -q`" ]
 then
docker rmi $(docker images -f "dangling=true" -q)
 fi
for file in ./*-compose.yml; do
    echo "$(tput setaf "2")" "building $file..." "$(tput sgr0)"
    docker-compose -f "$file" build
done
docker-compose -f docker-compose.yml up -d