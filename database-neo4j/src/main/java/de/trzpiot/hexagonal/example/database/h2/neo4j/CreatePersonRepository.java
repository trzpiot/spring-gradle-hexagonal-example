package de.trzpiot.hexagonal.example.database.h2.neo4j;

import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

@Repository
interface CreatePersonRepository extends Neo4jRepository<PersonEntity, Long> {

}
