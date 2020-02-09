package de.trzpiot.hexagonal.example.core.usecase.createperson;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import lombok.Value;

@Value
@NoArgsConstructor(force = true, access = AccessLevel.PRIVATE)
public class CreatePersonCommand {
    private String name;
    private String firstName;
    private Integer age;
}
