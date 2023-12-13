package de.trzpiot.hexagonal.example.database.h2.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

import static java.util.UUID.randomUUID;
import static lombok.AccessLevel.PRIVATE;


@Data
@Entity
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
