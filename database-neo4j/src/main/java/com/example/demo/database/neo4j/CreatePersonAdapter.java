package com.example.demo.database.neo4j;

import com.example.demo.core.CreatePersonPort;
import com.example.demo.core.Person;
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
