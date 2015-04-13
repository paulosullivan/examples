WIP!!!
Project not completed !!!

General
=======
This project will outline how to write a restful service.
It uses the following technologies:

Rest APIs
=========
1) Jersey backed by Spring
   Actual artifact -> jersey-spring3 v2.15
	 This artifact requires JSE 7 or above
2) Jackson JSON parser
	 Actual artifact -> jersey-media-json-jackson v2.15

Misc APIs / Specifications
==========================
1) JSE 7 or above is required (due to the jersey-spring artifact)
2) Servlet API 3.0 (i.e. JEE 7)
   3.1 is now available.
3) Spring Framework 4.1.4 (plus Java configuration instead of XML)
4) Maven 3
5) Maven Jetty Plugin v8 (you need to use v8 or above to support Java 6+ and the servlet 3.0 API)
   v9 is now available

Notes
=====
1) There was no jersey-spring4 artifact at the time of writing, but jersey-spring3 does work with Spring 4
   However, there is an issue when running jersey-spring3 in a servlet 3.X environment. 
   Essentially it means that you can't replace the web.xml file with Spring's WebApplicationInitializer (https://java.net/jira/browse/JERSEY-2236)
   Therefore, I had to comment out the my custom WebAppInitializer class and retain the web.xml
   This means that you are only using Java config for Spring itself, and not for the JEE stuff.
   
Local Deployment
================
No need for a standalone servlet container (given our use of the Maven Jetty Plugin).
In eclipse, simply right-click on your project -> Run As -> Run Configurations -> Maven Build, and add jetty:run to the Goals textbox.
Navigate to either http://localhost:8080/TestAppStatusServlet or http://localhost:8080/healthCheck.jsp (to check if the app is up).
The rest services can be found under http://localhost:8080/rest-spring-jersey/...
For example => http://localhost:8080/rest-spring-jersey/vehicles

Extra Documentation
===================
https://jersey.java.net/project-info/2.15/jersey/project/jersey-spring3/dependencies.html
https://jersey.java.net/project-info/2.15/jersey/project/json-jackson/dependencies.html
http://eclipse.org/jetty/documentation/current/what-jetty-version.html