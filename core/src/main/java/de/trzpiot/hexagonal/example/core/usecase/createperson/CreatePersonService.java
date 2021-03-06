package de.trzpiot.hexagonal.example.core.usecase.createperson;

import de.trzpiot.hexagonal.example.core.domain.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CreatePersonService implements CreatePersonUseCase {
    private final CreatePersonPort createPersonPort;

    @Autowired
    public CreatePersonService(final CreatePersonPort createPersonPort) {
        this.createPersonPort = createPersonPort;
    }

    @Override
    public Long createPerson(final CreatePersonCommand command) {
        final Person person = new Person(null, command.getName(), command.getFirstName(), command.getAge());
        return createPersonPort.createPerson(person);
    }
}
