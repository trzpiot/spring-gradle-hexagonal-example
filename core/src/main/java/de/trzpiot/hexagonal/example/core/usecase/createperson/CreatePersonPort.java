package de.trzpiot.hexagonal.example.core.usecase.createperson;

import de.trzpiot.hexagonal.example.core.domain.Person;

@FunctionalInterface
public interface CreatePersonPort {
    Long createPerson(Person person);
}
