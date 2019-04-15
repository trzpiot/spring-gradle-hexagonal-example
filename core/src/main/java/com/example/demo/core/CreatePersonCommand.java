package com.example.demo.core;

import lombok.Data;

@Data
public class CreatePersonCommand {
    String name;
    String firstName;
    Integer age;
}
