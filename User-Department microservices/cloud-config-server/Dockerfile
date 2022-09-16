FROM eclipse-temurin:17-jdk-focal
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} cloud-gateway.jar
ENTRYPOINT ["java","-jar","/cloud-config.jar"]
EXPOSE 9292