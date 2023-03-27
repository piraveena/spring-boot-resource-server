# Pre-requisites
1. Java 11
2. Maven version above 3.5.0

# How to run this application
1. Change client-id and secret
2. In the terminal, run `mvn clean spring-boot:run`
3. In the terminal, Run `curl localhost:8081/ -H "Authorization: Bearer <access_token>"`