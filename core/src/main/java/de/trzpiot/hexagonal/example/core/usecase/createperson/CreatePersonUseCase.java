package de.trzpiot.hexagonal.example.core.usecase.createperson;

public interface CreatePersonUseCase {
    Long createPerson(CreatePersonCommand command);
}
