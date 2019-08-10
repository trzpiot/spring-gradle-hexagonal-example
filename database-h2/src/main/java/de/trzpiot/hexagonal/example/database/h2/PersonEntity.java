package de.trzpiot.hexagonal.example.database.h2;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
class PersonEntity {
    @Id
    @GeneratedValue
    Long id;

    String name;
    String firstName;
    Integer age;
}
