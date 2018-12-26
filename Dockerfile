FROM openjdk:8
COPY target/docker-spring-boot-0.0.1-SNAPSHOT.jar docker-spring-boot-0.0.1-SNAPSHOT.jar
EXPOSE 8086
ENTRYPOINT ["java", "-jar", "docker-spring-boot-0.0.1-SNAPSHOT.jar"]