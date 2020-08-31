FROM openjdk:8-alpine
COPY target/User-*.jar /user_service.jar
EXPOSE 6000
CMD ["java" , "-jar", "/user_service.jar"]