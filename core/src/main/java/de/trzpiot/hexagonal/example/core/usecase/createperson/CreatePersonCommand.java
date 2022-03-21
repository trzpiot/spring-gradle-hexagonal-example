package de.trzpiot.hexagonal.example.core.usecase.createperson;

public record CreatePersonCommand(
        String name,
        String firstName,
        Integer age) {
}