package de.trzpiot.hexagonal.example.database.h2.usecase.createPerson;

import de.trzpiot.hexagonal.example.core.domain.Person;
import de.trzpiot.hexagonal.example.core.usecase.createPerson.CreatePersonPort;
import de.trzpiot.hexagonal.example.database.h2.domain.PersonEntity;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CreatePersonAdapter implements CreatePersonPort {
    private final CreatePersonRepository createPersonRepository;
    private final ModelMapper modelMapper;

    @Autowired
    public CreatePersonAdapter(CreatePersonRepository createPersonRepository, ModelMapper modelMapper) {
        this.createPersonRepository = createPersonRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public Long createPerson(Person person) {
        PersonEntity personEntity = modelMapper.map(person, PersonEntity.class);
        return createPersonRepository.save(personEntity).getId();
    }
}
