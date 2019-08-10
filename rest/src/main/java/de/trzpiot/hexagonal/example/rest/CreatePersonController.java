package de.trzpiot.hexagonal.example.rest;

import de.trzpiot.hexagonal.example.core.usecase.createPerson.CreatePersonCommand;
import de.trzpiot.hexagonal.example.core.usecase.createPerson.CreatePersonUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@PersonController
public class CreatePersonController {
    private final CreatePersonUseCase createPersonUseCase;

    @Autowired
    public CreatePersonController(CreatePersonUseCase createPersonUseCase) {
        this.createPersonUseCase = createPersonUseCase;
    }

    @PostMapping("/create")
    public ResponseEntity<Long> createPerson(@RequestBody CreatePersonCommand command) {
        return new ResponseEntity<>(createPersonUseCase.createPerson(command), HttpStatus.CREATED);
    }
}
