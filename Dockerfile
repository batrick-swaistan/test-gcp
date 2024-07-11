FROM openjdk:22-jdk
COPY  . /app/
ENTRYPOINT ["java", "-jar", "app.jar"]
EXPOSE 8080
