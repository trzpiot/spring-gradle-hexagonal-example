package de.trzpiot.hexagonal.example.rest;

import de.trzpiot.hexagonal.example.core.CreatePersonCommand;
import de.trzpiot.hexagonal.example.core.CreatePersonUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/person")
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
