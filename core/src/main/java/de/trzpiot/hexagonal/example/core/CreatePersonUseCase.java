package de.trzpiot.hexagonal.example.core;

public interface CreatePersonUseCase {
    Long createPerson(CreatePersonCommand command);
}
