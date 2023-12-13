package de.trzpiot.hexagonal.example.core.usecase.getperson;

import de.trzpiot.hexagonal.example.core.domain.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class GetPersonService implements GetPersonUseCase {
    private final GetPersonPort getPersonPort;

    @Autowired
    public GetPersonService(final GetPersonPort getPersonPort) {
        this.getPersonPort = getPersonPort;
    }

    @Override
    public Person getPerson(final UUID objectId) {
        return getPersonPort.getPerson(objectId);
    }
}
