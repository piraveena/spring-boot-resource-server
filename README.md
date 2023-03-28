# Pre-requisites
1. Java 11
2. Maven version above 3.5.0

# How to run this application
1. Change client-id and secret
2. In the terminal, run `mvn clean spring-boot:run`
3. In the terminal, Run `curl localhost:8081/ -H "Authorization: Bearer <access_token>"`


To call the protected endpoint:

```
curl --location 'localhost:8081/api' \
--header 'Authorization: Bearer 87302457-7fb0-3b7c-a4e4-be95d12a14c3' \
--header 'Cookie: JSESSIONID=E147FF8A47D4DD3D7BA0A09C03A33B2C'
```


To call the unprotected endpoint,

```
curl --location 'localhost:8081/products' \
```
