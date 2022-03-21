package de.trzpiot.hexagonal.example.core.domain;

public record Person(
        Long id,
        String name,
        String firstName,
        Integer age) {
}
