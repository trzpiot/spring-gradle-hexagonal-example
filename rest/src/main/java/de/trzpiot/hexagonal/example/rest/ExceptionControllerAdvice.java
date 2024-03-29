package de.trzpiot.hexagonal.example.rest;

import de.trzpiot.hexagonal.example.core.usecase.getperson.NotFoundException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import static org.springframework.http.HttpStatus.BAD_REQUEST;

@Slf4j
@ControllerAdvice
public final class ExceptionControllerAdvice extends ResponseEntityExceptionHandler {
    private ExceptionControllerAdvice() {
    }

    @ExceptionHandler(NotFoundException.class)
    ResponseEntity<Object> handle(final RuntimeException exception, final WebRequest request) {
        final var httpStatus = BAD_REQUEST;
        final var errorAttributes = ErrorAttributes.getErrorAttributes(httpStatus, exception.getMessage(), request);
        log.warn("NotFoundException: {}", errorAttributes);
        return handleExceptionInternal(exception, errorAttributes, new HttpHeaders(), httpStatus, request);
    }
}
