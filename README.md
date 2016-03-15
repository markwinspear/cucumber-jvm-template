cucumber-jvm-template
=====================

Environment variables are specified in the run configuration of the IDE
For details of using environment variables with Jenkins http://stackoverflow.com/questions/21130931/environment-variables-in-jenkins

Tagging: https://github.com/cucumber/cucumber/wiki/Tags
Executing only certain tags... -Dcucumber.options="--tags @smoke"

Execution example: -ea -Dhost="browserstack" -Dplatform="Windows" -Dos_version=10 -DbrowserName="chrome" -DbrowserVersion=48 -Dcucumber.options="--tags @smoke"

Note: For faster execution, it is possible to start the chromedriver.exe (eg via command line) then connect to it with Selenium Remote...
  driver = new RemoteWebDriver(new URL("localhost:9515"), DesiredCapabiltiies,chrome());
  
  This means the the driver is not started and stopped each test, but does mean that the driver requires manual stopping at the end
  TODO: Work out how to start chrome driver on a specific port in order to feed this into the code URL

This is based on a template project from [seleniumframework.com] (http://www.seleniumframework.com/cucumber-jvm-2/what-is-cucumber-jvm/)
