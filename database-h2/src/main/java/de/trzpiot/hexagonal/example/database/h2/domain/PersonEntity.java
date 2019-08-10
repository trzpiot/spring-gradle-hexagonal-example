package de.trzpiot.hexagonal.example.database.h2.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class PersonEntity {
    @Id
    @GeneratedValue
    Long id;

    String name;
    String firstName;
    Integer age;
}
