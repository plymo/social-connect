#!/usr/bin/env bash

docker pull mysql
docker run -d -p "63306:3306" -v /Users/jmahdal/Devel/docker/data/mysql-social:/mysql --name social_db -e MYSQL_ROOT_PASSWORD="social" -e MYSQL_USER="social" -e MYSQL_DATABASE="social" -e MYSQL_PASSWORD="social" mysql:5.5