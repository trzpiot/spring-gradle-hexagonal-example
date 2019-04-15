package com.example.demo.database;

import com.example.demo.core.CreatePersonPort;
import com.example.demo.core.Person;
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
        return createPersonRepository.save(person).getId();
    }
}
