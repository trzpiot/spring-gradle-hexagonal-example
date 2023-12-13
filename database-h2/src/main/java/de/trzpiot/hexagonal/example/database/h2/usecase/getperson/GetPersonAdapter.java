package de.trzpiot.hexagonal.example.database.h2.usecase.getperson;

import de.trzpiot.hexagonal.example.core.domain.Person;
import de.trzpiot.hexagonal.example.core.usecase.getperson.GetPersonPort;
import de.trzpiot.hexagonal.example.core.usecase.getperson.NotFoundException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

import static java.lang.String.format;

@Slf4j
@Service
public class GetPersonAdapter implements GetPersonPort {
    private final GetPersonRepository getPersonRepository;

    @Autowired
    public GetPersonAdapter(final GetPersonRepository getPersonRepository) {
        this.getPersonRepository = getPersonRepository;
    }

    @Override
    public Person getPerson(final UUID objectId) {
        final var personEntity = getPersonRepository.findByObjectId(objectId).orElseThrow(() -> new NotFoundException(format("Person with Object ID '%s' not found", objectId)));
        log.info("[H2] Get person: {}", personEntity);
        return new Person(personEntity.getObjectId(), personEntity.getName(), personEntity.getFirstName(), personEntity.getAge());
    }
}
