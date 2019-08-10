package de.trzpiot.hexagonal.example.core.usecase.createPerson;

import de.trzpiot.hexagonal.example.core.domain.Person;

public interface CreatePersonPort {
    Long createPerson(Person person);
}
