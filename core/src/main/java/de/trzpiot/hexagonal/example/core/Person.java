package de.trzpiot.hexagonal.example.core;

import lombok.Data;

@Data
public class Person {
    Long id;
    String name;
    String firstName;
    Integer age;
}
