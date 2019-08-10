package de.trzpiot.hexagonal.example.database.h2.neo4j;

import org.modelmapper.ModelMapper;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.neo4j.repository.config.EnableNeo4jRepositories;

@Configuration
@EnableNeo4jRepositories(basePackages = "de.trzpiot.hexagonal.example.database.neo4j")
@EntityScan(basePackages = "de.trzpiot.hexagonal.example.database.neo4js")
public class Neo4jDatabaseConfiguration {
    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }
}
