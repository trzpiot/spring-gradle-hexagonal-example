package de.trzpiot.hexagonal.example.core.usecase.createperson;

import java.util.UUID;

@FunctionalInterface
public interface CreatePersonUseCase {
    UUID createPerson(final CreatePersonCommand command);
}
