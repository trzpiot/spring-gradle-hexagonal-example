package de.trzpiot.hexagonal.example.database.h2.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
// H2 needs a default constructor to create an object of this class. Therefore we have to use @Data instead of @Value.
@NoArgsConstructor
public class PersonEntity {
    @Id
    @GeneratedValue
    private Long id;

    private String name;
    private String firstName;
    private Integer age;

    public PersonEntity(String name, String firstName, Integer age) {
        this.name = name;
        this.firstName = firstName;
        this.age = age;
    }
}
