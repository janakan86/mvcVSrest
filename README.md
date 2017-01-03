# mvcVSrest
A very very simple implementation to compare spring MVC with Spring Rest


The purpose of this is to try out Spring MVC and Rest

How to run
1- download the folder
2- navigate to the folder and execute the following maven command
    mvn jetty:run

    Note the jetty is configured to run in port 8085. If that port is already engaged, change the port in the pom.xml

3- Go to the browser and test MVC request
    http://localhost:8085/spring/mvc/hello?name=janakan

4- Go to the browser and test the REST request
    http://localhost:8085/spring/rest/hello?name=janakan