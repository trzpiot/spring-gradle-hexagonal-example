package de.trzpiot.hexagonal.example.database.neo4j.domain;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Node;

@Data
@Node
public class PersonEntity {
    @Id
    @GeneratedValue
    private Long id;

    private String name;
    private String firstName;
    private Integer age;

    public PersonEntity(final String name, final String firstName, final Integer age) {
        this.name = name;
        this.firstName = firstName;
        this.age = age;
    }
}
