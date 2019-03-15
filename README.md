# BasicRESTApiUsingSpring
This repository introduces with the basic understanding of building various REST api using spring boot

Pre-requisite: java and maven

		
Note: This application runs on a non default port 6060 . Value is set in 
	  ../basic/src/main/resources/application.properties
	  
	  
Steps to follow to start the api:
1) go to ..\BasicRESTApiUsingSpringBoot\basic\
2) mvn clean install
3) java -jar target/basic-rest-service-0.1.0.jar

Note : You can use postman application to do the below steps

4) Do a GET ping http://localhost:8080/greeting
   Response : {"id":1,"content":"Hello, World!"}
5) Do a GET ping http://localhost:6060/date
   Response :{ "id": 1, "content": "Today's date is : 2019/03/15 23:57:28" }


	  
	  