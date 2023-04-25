FROM openjdk:11-ea-jdk-slim
VOLUME /tmp
COPY build/libs/userservice-0.0.1-SNAPSHOT.jar UserService.jar
ENTRYPOINT ["java","-jar","UserService.jar"]