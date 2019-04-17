package com.example.demo.database.neo4j;

import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CreatePersonRepository extends Neo4jRepository<PersonEntity, Long> {

}
