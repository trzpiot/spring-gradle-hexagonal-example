package de.trzpiot.hexagonal.example.rest;

import org.springframework.http.HttpStatus;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.context.request.WebRequest;

import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.HashMap;
import java.util.Map;

public interface ErrorAttributes {
    static Map<String, Object> getErrorAttributes(final HttpStatus httpStatus, final String message, final WebRequest request) {
        final Map<String, Object> errorAttributes = new HashMap<>();
        errorAttributes.put("timestamp", LocalDateTime.now(ZoneOffset.UTC));
        errorAttributes.put("status", httpStatus.value());
        errorAttributes.put("error", httpStatus.getReasonPhrase());
        errorAttributes.put("message", message);
        final String requestURI = ((ServletRequestAttributes) request).getRequest().getRequestURI();
        errorAttributes.put("path", requestURI);
        return errorAttributes;
    }
}
