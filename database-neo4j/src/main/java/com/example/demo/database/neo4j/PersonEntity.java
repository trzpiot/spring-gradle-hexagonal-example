package com.example.demo.database.neo4j;

import lombok.Data;
import org.neo4j.ogm.annotation.NodeEntity;

@Data
@NodeEntity
public class PersonEntity {
    Long id;
    String name;
    String firstName;
    Integer age;
}
