package de.trzpiot.hexagonal.example.core.usecase.getperson;

import de.trzpiot.hexagonal.example.core.domain.Person;

import java.util.UUID;

@FunctionalInterface
public interface GetPersonUseCase {
    Person getPerson(final UUID objectId);
}
