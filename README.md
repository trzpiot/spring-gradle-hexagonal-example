# spring-gradle-hexagonal-example

A Spring example application with a hexagonal (clean) architecture & multi modules with Gradle.

For a detailed description of the example application with an explanation of clean architecture, among other things, see here: TODO
## Prerequirements

- JDK >= 11
- Docker
- Docker Compose
## Run

#### Clone the project

```bash
## HTTPS
git clone https://github.com/trzpiot/spring-gradle-hexagonal-example.git

# SSH
git clone git@github.com:trzpiot/spring-gradle-hexagonal-example.git
```

#### Go to the project directory

```bash
cd spring-gradle-hexagonal-example
```

#### Start the Neo4j server

```bash
cd database-neo4j
docker-compose up -d
cd ..
```

#### Start the example application server

```bash
./gradlew bootRun
```


## FAQ

TODO