package de.trzpiot.hexagonal.example.core.usecase.getPerson;

import de.trzpiot.hexagonal.example.core.domain.Person;

public interface GetPersonUseCase {
    Person getPerson(Long id);
}
