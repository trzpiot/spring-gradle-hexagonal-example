package de.trzpiot.hexagonal.example.core.usecase.createperson;

import de.trzpiot.hexagonal.example.core.domain.Person;

import java.util.UUID;

@FunctionalInterface
public interface CreatePersonPort {
    UUID createPerson(final Person person);
}
