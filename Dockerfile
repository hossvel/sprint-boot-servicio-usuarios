FROM openjdk:19-jdk-alpine
VOLUME /tmp
ADD ./target/sprint-boot-servicio-usuarios-0.0.1-SNAPSHOT.jar  servicio-usuarios.jar
ENTRYPOINT ["java", "-jar","/servicio-usuarios.jar"]