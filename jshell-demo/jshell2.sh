#!/bin/bash

./gradlew build -x test
./gradlew generateClasspath
CLASSPATH=$(cat classpath.txt) jshell -start DEFAULT -start PRINTING -start ./startup.jsh
