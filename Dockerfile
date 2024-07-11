FROM openjdk:21-jdk
COPY ./target/testgcp-0.0.1-SNAPSHOT.jar /
ENTRYPOINT exec java -jar /testgcp-0.0.1-SNAPSHOT.jar
EXPOSE 8080
