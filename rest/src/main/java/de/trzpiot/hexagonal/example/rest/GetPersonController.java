package de.trzpiot.hexagonal.example.rest;

import de.trzpiot.hexagonal.example.core.domain.Person;
import de.trzpiot.hexagonal.example.core.usecase.getperson.GetPersonUseCase;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.UUID;

import static org.springframework.http.HttpStatus.OK;

@Slf4j
@PersonController
public class GetPersonController {
    private final GetPersonUseCase getPersonUseCase;

    @Autowired
    public GetPersonController(final GetPersonUseCase getPersonUseCase) {
        this.getPersonUseCase = getPersonUseCase;
    }

    @GetMapping("/get/{objectId}")
    public ResponseEntity<Person> getPerson(@PathVariable("objectId") final UUID objectId) {
        log.info("Request: /person/get/{}", objectId);
        return new ResponseEntity<>(getPersonUseCase.getPerson(objectId), OK);
    }
}
