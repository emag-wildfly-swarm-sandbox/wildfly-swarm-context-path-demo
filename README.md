# wildfly-swarm-context-path-demo

This is an example which changes the context path with yml.

## Build and Run

``` sh
./mvnw clean package
java -jar target/wildfly-swarm-context-path-demo-swarm.jar
```

## Access API

``` sh
$ curl localhost:8080/hello
OK
```