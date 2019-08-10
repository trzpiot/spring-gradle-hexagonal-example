package de.trzpiot.hexagonal.example.database.h2.domain;

import lombok.Value;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Value
@Entity
public class PersonEntity {
    @Id
    @GeneratedValue
    Long id;

    String name;
    String firstName;
    Integer age;
}
