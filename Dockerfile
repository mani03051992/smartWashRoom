FROM openjdk:17
EXPOSE 8080
COPY target/smartWashroomjar.jar smartWashroomjar.jar

CMD ["java", "-jar", "smartWashroomjar.jar"]
