package de.trzpiot.hexagonal.example.core;

import lombok.Data;

@Data
public class CreatePersonCommand {
    String name;
    String firstName;
    Integer age;
}
