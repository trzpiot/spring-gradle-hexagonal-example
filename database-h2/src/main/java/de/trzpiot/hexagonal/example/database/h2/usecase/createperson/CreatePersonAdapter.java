package de.trzpiot.hexagonal.example.database.h2.usecase.createperson;

import de.trzpiot.hexagonal.example.core.domain.Person;
import de.trzpiot.hexagonal.example.core.usecase.createperson.CreatePersonPort;
import de.trzpiot.hexagonal.example.database.h2.domain.PersonEntity;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class CreatePersonAdapter implements CreatePersonPort {
    private final CreatePersonRepository createPersonRepository;

    @Autowired
    public CreatePersonAdapter(final CreatePersonRepository createPersonRepository) {
        this.createPersonRepository = createPersonRepository;
    }

    @Override
    public Long createPerson(final Person person) {
        final var personEntity = new PersonEntity(person.name(), person.firstName(), person.age());
        log.info("[H2] Create person: {}", personEntity);
        return createPersonRepository.save(personEntity).getId();
    }
}
