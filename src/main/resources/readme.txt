Listar Actores desde sakila postgres
Arquitectura basica Component Controller Service

Demo project for Spring Boot 2.4.2 java application with jdbc
JdbcTemplate from package org.springframework.jdbc.core;

spring initializr

dependencies

-Spring Web WEB
Build web, including RESTful, applications using Spring MVC. Uses Apache Tomcat as the default embedded container.

-Spring JPA DataSQL
Persist data in SQL stores with JPA.
-PostgreSQL Driver SQL

 @PostMapping
 @PutMapping(path = "{id}")
@DeleteMapping(path = "{id}")
josemeva@DESKTOP-178GV1H /cygdrive/c/Interactiva/seccion04-spring/demoJPA


http://localhost:8080/swagger-ui/

$ mvn dependency:list


lanzar aplicacion

$ mvn clean install
$ mvn spring-boot:run
josemeva@DESKTOP-178GV1H /cygdrive/c/Interactiva/seccion04-spring/demoJPA/target
$ java -jar demoJPA-0.0.1-SNAPSHOT.jar

se habilita datos por consola y las siguientes urls
http://localhost:8080/

http://localhost:8080/api/actor




$ netstat -ano | findstr :8080

$ taskkill /PID [pid] /F


// Unix
lsof -i:8080
kill -9 12345
