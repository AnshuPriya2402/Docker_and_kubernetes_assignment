FROM openjdk:17
EXPOSE 8080
ADD target/dockerAssignment-0.0.1-SNAPSHOT.jar dockerAssignment.jar
ENTRYPOINT [ "java", "-jar", "dockerAssignment.jar" ]
