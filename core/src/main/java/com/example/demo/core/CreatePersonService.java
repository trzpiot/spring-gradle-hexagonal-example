package com.example.demo.core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CreatePersonService implements CreatePersonUseCase {
    private final CreatePersonPort createPersonPort;

    @Autowired
    public CreatePersonService(CreatePersonPort createPersonPort) {
        this.createPersonPort = createPersonPort;
    }

    @Override
    public Long createPerson(CreatePersonCommand command) {
        Person person = new Person();
        person.setName(command.getName());
        person.setFirstName(command.getFirstName());
        person.setAge(command.getAge());
        return createPersonPort.createPerson(person);
    }
}
