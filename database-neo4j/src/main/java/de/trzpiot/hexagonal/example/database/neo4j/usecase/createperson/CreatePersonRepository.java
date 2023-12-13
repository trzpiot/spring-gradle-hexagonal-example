package de.trzpiot.hexagonal.example.database.neo4j.usecase.createperson;

import de.trzpiot.hexagonal.example.database.neo4j.domain.PersonEntity;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
interface CreatePersonRepository extends Neo4jRepository<PersonEntity, UUID> {

}
