FROM openjdk:8-jdk-alpine
VOLUME /tmp
COPY target/*.jar app.jar
CMD
ENTRYPOINT ["java","-jar","/app.jar"]