package com.example.demo.database;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CreatePersonRepository extends JpaRepository<PersonEntity, Long> {

}
