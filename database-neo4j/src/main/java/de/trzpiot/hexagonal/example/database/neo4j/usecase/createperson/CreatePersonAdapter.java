package de.trzpiot.hexagonal.example.database.neo4j.usecase.createperson;

import de.trzpiot.hexagonal.example.core.domain.Person;
import de.trzpiot.hexagonal.example.core.usecase.createperson.CreatePersonPort;
import de.trzpiot.hexagonal.example.database.neo4j.domain.PersonEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CreatePersonAdapter implements CreatePersonPort {
    private final CreatePersonRepository createPersonRepository;

    @Autowired
    public CreatePersonAdapter(final CreatePersonRepository createPersonRepository) {
        this.createPersonRepository = createPersonRepository;
    }

    @Override
    public Long createPerson(final Person person) {
        final PersonEntity personEntity = new PersonEntity(person.getName(), person.getFirstName(), person.getAge());
        return createPersonRepository.save(personEntity).getId();
    }
}
