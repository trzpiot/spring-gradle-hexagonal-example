package de.trzpiot.hexagonal.example.rest;

import de.trzpiot.hexagonal.example.core.domain.Person;
import de.trzpiot.hexagonal.example.core.usecase.getPerson.GetPersonUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@PersonController
public class GetPersonController {
    private final GetPersonUseCase getPersonUseCase;

    @Autowired
    public GetPersonController(GetPersonUseCase getPersonUseCase) {
        this.getPersonUseCase = getPersonUseCase;
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<Person> getPerson(@PathVariable Long id) {
        return new ResponseEntity<>(getPersonUseCase.getPerson(id), HttpStatus.OK);
    }
}
