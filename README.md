cucumber-jvm-template
=====================

Environment variables are specified in the run configuration of the IDE
For details of using environment variables with Jenkins http://stackoverflow.com/questions/21130931/environment-variables-in-jenkins

Tagging: https://github.com/cucumber/cucumber/wiki/Tags
Executing only certain tags... -Dcucumber.options="--tags @smoke"

Execution example: -ea -Dhost="browserstack" -Dplatform="Windows" -Dos_version=10 -DbrowserName="chrome" -DbrowserVersion=48 -Dcucumber.options="--tags @smoke"

This is based on a template project from [seleniumframework.com] (http://www.seleniumframework.com/cucumber-jvm-2/what-is-cucumber-jvm/)
