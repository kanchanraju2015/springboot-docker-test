
FROM openjdk:17

COPY target/springboot-docker.jar mydockerapp.jar

EXPOSE 8080

ENTRYPOINT ["java","-jar","mydockerapp.jar"]


