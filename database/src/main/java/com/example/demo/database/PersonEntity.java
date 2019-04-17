package com.example.demo.database;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class PersonEntity {
    @Id
    @GeneratedValue
    Long id;

    String name;
    String firstName;
    Integer age;
}
