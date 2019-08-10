package de.trzpiot.hexagonal.example.core.usecase.createPerson;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class CreatePersonCommand {
    private String name;
    private String firstName;
    private Integer age;
}
