package de.trzpiot.hexagonal.example.database.h2.configuration;

import org.modelmapper.ModelMapper;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories(basePackages = "de.trzpiot.hexagonal.example.database.h2")
@EntityScan(basePackages = "de.trzpiot.hexagonal.example.database.h2")
public class SqlDatabaseConfiguration {
    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }
}
