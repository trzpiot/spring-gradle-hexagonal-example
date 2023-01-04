package de.trzpiot.hexagonal.example.database.h2.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Entity
@NoArgsConstructor(force = true, access = AccessLevel.PRIVATE)
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
