FROM maven:3.9.12-eclipse-temurin-21 AS build
WORKDIR /build
COPY pom.xml /build/pom.xml
COPY src /build/src
RUN mvn clean package

FROM eclipse-temurin:21-jre-alpine
COPY --from=build /build/target/*.jar /opt/app.jar
CMD [ "java", "-jar", "/opt/app.jar" ]