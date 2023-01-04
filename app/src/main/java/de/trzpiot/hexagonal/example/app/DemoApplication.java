package de.trzpiot.hexagonal.example.app;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import static org.springframework.boot.SpringApplication.run;

@SpringBootApplication(scanBasePackages = "de.trzpiot.hexagonal.example")
public class DemoApplication {
    public static void main(final String... args) {
        run(DemoApplication.class, args);
    }
}
