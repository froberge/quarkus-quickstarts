# Simple Quarkus Service 

This project uses [Quarkus](https://quarkus.io/), the Supersonic Subatomic Java Framework. It expose an REST endpoint that return a greeting message.


## Running the application

The applicaiton can be run in dev mode with live coding enable using :
```
./mvnw compile quarkus:dev
```

The applicaiton can be run in test mode only using:
```
./mvnw clean test
```



## Packaging the application

The application can be packaged using:
```
./mvnw package
```
It produces the `quarkus-run.jar` file in the `target/quarkus-app/` directory.

:warning: This is not an _über-jar_ as the dependencies are copied into the `target/quarkus-app/lib/` directory.


The application can be package in an  _über-jar_ using:
```
./mvnw package -Dquarkus.package.type=uber-jar
```

The _über-jar_ is now runnable using 
```
java -jar target/quarkus-app/quarkus-run.jar.
```

## Creating a native executable

You can create a native executable using: 
```
./mvnw package -Pnative
```

Or, if you don't have GraalVM installed, you can run the native executable build in a container using: 
```
./mvnw package -Pnative -Dquarkus.native.container-build=true
```

The native executable using: 
```
./target/quarkus-greeting-1.0.0-SNAPSHOT-runner
```

If you want to learn more about building native executables, please consult https://quarkus.io/guides/maven-tooling.html.


## Define endpoint

Endpoint | Description |  
---------|-------------|
/ | The default endpoint
