package de.trzpiot.hexagonal.example.database.neo4j.configuration;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.neo4j.repository.config.EnableNeo4jRepositories;

import static org.neo4j.cypherdsl.core.renderer.Dialect.NEO4J_5;

@Configuration
@EnableNeo4jRepositories(basePackages = "de.trzpiot.hexagonal.example.database.neo4j")
@EntityScan(basePackages = "de.trzpiot.hexagonal.example.database.neo4j")
public class Neo4jDatabaseConfiguration {
    @Bean
    org.neo4j.cypherdsl.core.renderer.Configuration cypherDslConfiguration() {
        return org.neo4j.cypherdsl.core.renderer.Configuration.newConfig()
                .withDialect(NEO4J_5)
                .build();
    }
}
