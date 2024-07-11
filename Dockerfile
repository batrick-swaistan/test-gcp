FROM openjdk:22-jdk

COPY  . /app/

WORKDIR /app

EXPOSE 80

ENTRYPOINT ["java", "-jar", "app.jar"]
