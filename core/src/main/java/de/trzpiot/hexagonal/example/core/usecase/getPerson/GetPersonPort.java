package de.trzpiot.hexagonal.example.core.usecase.getPerson;

import de.trzpiot.hexagonal.example.core.domain.Person;

public interface GetPersonPort {
    Person getPerson(Long id);
}
