package de.trzpiot.hexagonal.example.core.usecase.createperson;

@FunctionalInterface
public interface CreatePersonUseCase {
    Long createPerson(CreatePersonCommand command);
}
