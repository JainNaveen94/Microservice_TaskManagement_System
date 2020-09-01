  
FROM openjdk:8-alpine
COPY target/netflix-eureka-naming-server-*.jar /netflix-eureka-naming-server.jar
EXPOSE 8761
CMD ["java" , "-jar", "/netflix-eureka-naming-server.jar"]