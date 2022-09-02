FROM openjdk:11
EXPOSE 8093
ADD target/dev-0.0.1-SNAPSHOT.jar springboot-docker.jar
ENTRYPOINT ["java" , "-jar", "/springboot-docker.jar"]