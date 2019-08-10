package de.trzpiot.hexagonal.example.core.usecase.createPerson;

public interface CreatePersonUseCase {
    Long createPerson(CreatePersonCommand command);
}
