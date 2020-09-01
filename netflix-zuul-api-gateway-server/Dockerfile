  
FROM openjdk:8-alpine
COPY target/netflix-zuul-api-gateway-server-*.jar /netflix-zuul-api-gateway-server.jar
EXPOSE 8765
CMD ["java" , "-jar", "/netflix-zuul-api-gateway-server.jar"]