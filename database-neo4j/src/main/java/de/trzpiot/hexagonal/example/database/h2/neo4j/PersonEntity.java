package de.trzpiot.hexagonal.example.database.h2.neo4j;

import lombok.Data;
import org.neo4j.ogm.annotation.NodeEntity;

@Data
@NodeEntity
class PersonEntity {
    Long id;
    String name;
    String firstName;
    Integer age;
}
