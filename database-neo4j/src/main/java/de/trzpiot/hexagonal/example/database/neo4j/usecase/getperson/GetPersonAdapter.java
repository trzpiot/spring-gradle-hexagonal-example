package de.trzpiot.hexagonal.example.database.neo4j.usecase.getperson;

import de.trzpiot.hexagonal.example.core.domain.Person;
import de.trzpiot.hexagonal.example.core.usecase.getperson.GetPersonPort;
import de.trzpiot.hexagonal.example.database.neo4j.domain.PersonEntity;
import org.neo4j.graphdb.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GetPersonAdapter implements GetPersonPort {
    private final GetPersonRepository getPersonRepository;

    @Autowired
    public GetPersonAdapter(GetPersonRepository getPersonRepository) {
        this.getPersonRepository = getPersonRepository;
    }

    @Override
    public Person getPerson(Long id) {
        PersonEntity personEntity = getPersonRepository.findById(id).orElseThrow(() -> new NotFoundException(String.format("Person with ID '%d' not found", id)));
        return new Person(personEntity.getId(), personEntity.getName(), personEntity.getFirstName(), personEntity.getAge());
    }
}
