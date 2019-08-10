package de.trzpiot.hexagonal.example.core.domain;

import lombok.Value;

@Value
public class Person {
    Long id;
    String name;
    String firstName;
    Integer age;
}
