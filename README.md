# spring-boot-hello-world
Simple web application.

## Create the mvn package
```bash
mvn package
```
## create docker image
### this may require docker env. [Docker Desktop](https://docs.docker.com/desktop/) can be used to run docker image.
```bash
docker build -t hello-world:0.1.0
```

## run image as docker container
```bash
docker run -d --port 8080:8080 hello-world:0.1.0
```

## check out result either in browser or cli
```bash
curl http://0.0.0.0:8080
curl http://0.0.0.0:8080/hello
curl http://0.0.0.0:8080/hello?name=springBoot
curl http://0.0.0.0:8080/goodbye
```
