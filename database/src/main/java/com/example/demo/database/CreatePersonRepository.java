package com.example.demo.database;

import com.example.demo.core.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CreatePersonRepository extends JpaRepository<Person, Long> {

}
