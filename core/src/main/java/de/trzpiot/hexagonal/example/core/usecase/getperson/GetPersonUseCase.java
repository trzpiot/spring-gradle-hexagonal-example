package de.trzpiot.hexagonal.example.core.usecase.getperson;

import de.trzpiot.hexagonal.example.core.domain.Person;

@FunctionalInterface
public interface GetPersonUseCase {
    Person getPerson(Long id);
}
