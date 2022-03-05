#!/bin/bash

mvn clean install
docker build -t demo/helloworld .
docker-compose up
