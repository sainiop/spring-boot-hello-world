FROM openjdk:11.0.15-jre-buster
COPY target/hello-world-0.0.1-SNAPSHOT.jar hello-world-0.0.1-docker.jar
ENTRYPOINT ["java", "-jar", "/hello-world-0.0.1-docker.jar"]