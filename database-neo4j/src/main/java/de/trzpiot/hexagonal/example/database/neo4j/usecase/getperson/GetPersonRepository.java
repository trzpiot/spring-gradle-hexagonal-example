package de.trzpiot.hexagonal.example.database.neo4j.usecase.getperson;

import de.trzpiot.hexagonal.example.database.neo4j.domain.PersonEntity;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

@Repository
interface GetPersonRepository extends Neo4jRepository<PersonEntity, Long> {
}
