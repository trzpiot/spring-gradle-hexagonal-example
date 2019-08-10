package de.trzpiot.hexagonal.example.database.neo4j.domain;

import lombok.Data;
import org.neo4j.ogm.annotation.NodeEntity;

@Data
@NodeEntity
public class PersonEntity {
    private Long id;
    private String name;
    private String firstName;
    private Integer age;

    /*
     * We need this constructor and must use @Data instead of @Value, because Neo4j does not accept it when we create
     * an object from this class and pass null as ID.
     */
    public PersonEntity(String name, String firstName, Integer age) {
        this.name = name;
        this.firstName = firstName;
        this.age = age;
    }
}
