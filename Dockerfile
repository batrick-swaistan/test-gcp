FROM openjdk:21-jdk
COPY  . /app/
ENTRYPOINT ["java", "-jar", "app.jar"]
EXPOSE 8080
