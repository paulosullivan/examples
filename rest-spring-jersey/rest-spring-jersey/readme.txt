WIP!!!
Project not completed !!!

General
=======
This project will outline how to write a restful service.
It uses the following technologies:

Rest APIs
1) Jersey backed by Spring (i.e. the jersey-spring3 API)
2) JSON
3) Jackson JSON parser

Misc APIs
1) Servlet API 3.0 (i.e. JEE 7)
   3.1 is now available.
2) Spring Framework 4.1.4 (plus Java configuration instead of XML)
3) Maven 3
4) Maven jetty Plugin v8 (you need to use v8 or above to support the servlet 3.0 API)
   v9 is now available

Notes
=====
1) There was no jersey-spring4 artifact at the time of writing, but jersey-spring3 does work with Spring 4
   However, there is an issue when running jersey-spring3 in a servlet 3.X environment. 
   Essentially it means that you can't replace the web.xml file with Spring's WebApplicationInitializer (https://java.net/jira/browse/JERSEY-2236)
   Therefore, I had to comment out the my custom WebAppInitializer class and retain the web.xml
   This means that you are only using Java config for Spring itself, and not for the JEE stuff.
   
Local 
