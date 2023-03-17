FROM openjdk:11
COPY target/*.jar insure-me-1.0.jar
ENTRYPOINT ["java","-jar","/insure-me-1.0.jar"]
