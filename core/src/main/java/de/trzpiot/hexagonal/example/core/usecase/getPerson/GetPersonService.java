package de.trzpiot.hexagonal.example.core.usecase.getPerson;

import de.trzpiot.hexagonal.example.core.domain.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GetPersonService implements GetPersonUseCase {
    private final GetPersonPort getPersonPort;

    @Autowired
    public GetPersonService(GetPersonPort getPersonPort) {
        this.getPersonPort = getPersonPort;
    }

    @Override
    public Person getPerson(Long id) {
        return getPersonPort.getPerson(id);
    }
}
