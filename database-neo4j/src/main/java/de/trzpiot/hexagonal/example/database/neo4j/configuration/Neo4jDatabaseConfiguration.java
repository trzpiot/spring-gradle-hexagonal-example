package de.trzpiot.hexagonal.example.database.neo4j.configuration;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.neo4j.repository.config.EnableNeo4jRepositories;

@Configuration
@EnableNeo4jRepositories(basePackages = "de.trzpiot.hexagonal.example.database.neo4j")
@EntityScan(basePackages = "de.trzpiot.hexagonal.example.database.neo4j")
public class Neo4jDatabaseConfiguration {
}
