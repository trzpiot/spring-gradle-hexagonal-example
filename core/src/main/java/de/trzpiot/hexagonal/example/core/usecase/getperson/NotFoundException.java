package de.trzpiot.hexagonal.example.core.usecase.getperson;

import java.io.Serial;

public class NotFoundException extends RuntimeException {

    @Serial
    private static final long serialVersionUID = 8045915987132114261L;

    public NotFoundException(final String message) {
        super(message);
    }
}
