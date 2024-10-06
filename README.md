# spring-gradle-hexagonal-example

[![Maintenance](https://img.shields.io/maintenance/yes/2025)](https://github.com/trzpiot/spring-gradle-hexagonal-example/commits/main)
[![Nix Flake](https://img.shields.io/badge/Nix%20Flake-%235277C3?logo=snowflake)](https://nix.dev/concepts/flakes.html)


A Spring example application with a hexagonal (clean) architecture & multi modules with Gradle.

## Prerequirements

- JDK >= 21
- Docker
- Docker Compose

## Run

#### Clone the project

```bash
# HTTPS
git clone https://github.com/trzpiot/spring-gradle-hexagonal-example.git

# or

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

## API

You can use the [Bruno collection](/bruno) for testing the API ([What is Bruno?](https://github.com/usebruno/bruno)).

### Create person

#### Request

`POST /person/create`

```json
{
  "name": "Name",
  "firstName": "FirstName",
  "age": 44
}
```

#### Response

The Object ID of the created person entity.

```json
"b6b5a014-1829-4195-b7be-80b742455297"
```

### Get person

#### Request

`GET /person/get/{objectId}`

#### Response

```json
{
  "objectId": "b6b5a014-1829-4195-b7be-80b742455297",
  "name": "Name",
  "firstName": "FirstName",
  "age": 44
}
```
