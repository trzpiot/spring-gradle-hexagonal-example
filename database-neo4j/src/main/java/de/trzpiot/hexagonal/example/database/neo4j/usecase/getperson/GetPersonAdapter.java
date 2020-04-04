package de.trzpiot.hexagonal.example.database.neo4j.usecase.getperson;

import de.trzpiot.hexagonal.example.core.domain.Person;
import de.trzpiot.hexagonal.example.core.usecase.getperson.GetPersonPort;
import de.trzpiot.hexagonal.example.core.usecase.getperson.NotFoundException;
import de.trzpiot.hexagonal.example.database.neo4j.domain.PersonEntity;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class GetPersonAdapter implements GetPersonPort {
    private final GetPersonRepository getPersonRepository;

    @Autowired
    public GetPersonAdapter(final GetPersonRepository getPersonRepository) {
        this.getPersonRepository = getPersonRepository;
    }

    @Override
    public Person getPerson(final Long id) {
        final PersonEntity personEntity = getPersonRepository.findById(id).orElseThrow(() -> new NotFoundException(String.format("Person with ID '%d' not found", id)));
        log.info("[Neo4j] Get person: {}", personEntity);
        return new Person(personEntity.getId(), personEntity.getName(), personEntity.getFirstName(), personEntity.getAge());
    }
}
