package de.trzpiot.hexagonal.example.core.domain;

import java.util.UUID;

public record Person(
        UUID objectId,
        String name,
        String firstName,
        Integer age) {
}
