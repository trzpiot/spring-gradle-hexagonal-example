package de.trzpiot.hexagonal.example.rest;

import de.trzpiot.hexagonal.example.core.usecase.createperson.CreatePersonCommand;
import de.trzpiot.hexagonal.example.core.usecase.createperson.CreatePersonUseCase;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.UUID;

import static org.springframework.http.HttpStatus.CREATED;

@Slf4j
@PersonController
public class CreatePersonController {
    private final CreatePersonUseCase createPersonUseCase;

    @Autowired
    public CreatePersonController(final CreatePersonUseCase createPersonUseCase) {
        this.createPersonUseCase = createPersonUseCase;
    }

    @PostMapping("/create")
    public ResponseEntity<UUID> createPerson(@RequestBody final CreatePersonCommand command) {
        log.info("Request: /person/create | Body: {}", command);
        return new ResponseEntity<>(createPersonUseCase.createPerson(command), CREATED);
    }
}
