package de.trzpiot.hexagonal.example.database.h2.usecase.createperson;

import de.trzpiot.hexagonal.example.core.domain.Person;
import de.trzpiot.hexagonal.example.core.usecase.createperson.CreatePersonPort;
import de.trzpiot.hexagonal.example.database.h2.domain.PersonEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CreatePersonAdapter implements CreatePersonPort {
    private final CreatePersonRepository createPersonRepository;

    @Autowired
    public CreatePersonAdapter(CreatePersonRepository createPersonRepository) {
        this.createPersonRepository = createPersonRepository;
    }

    @Override
    public Long createPerson(Person person) {
        PersonEntity personEntity = new PersonEntity(null, person.getName(), person.getFirstName(), person.getAge());
        return createPersonRepository.save(personEntity).getId();
    }
}
