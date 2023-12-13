package de.trzpiot.hexagonal.example.database.neo4j.domain;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;

import java.util.UUID;

import static java.util.UUID.randomUUID;
import static lombok.AccessLevel.PRIVATE;

@Data
@Node
@NoArgsConstructor(force = true, access = PRIVATE)
public class PersonEntity {
    @Id
    @GeneratedValue
    private Long id;

    private UUID objectId;
    private String name;
    private String firstName;
    private Integer age;

    public PersonEntity(final String name, final String firstName, final Integer age) {
        this.objectId = randomUUID();
        this.name = name;
        this.firstName = firstName;
        this.age = age;
    }
}
