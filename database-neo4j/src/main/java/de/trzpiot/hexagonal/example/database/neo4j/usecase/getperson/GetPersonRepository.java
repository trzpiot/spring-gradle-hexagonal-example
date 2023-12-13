package de.trzpiot.hexagonal.example.database.neo4j.usecase.getperson;

import de.trzpiot.hexagonal.example.database.neo4j.domain.PersonEntity;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
interface GetPersonRepository extends Neo4jRepository<PersonEntity, UUID> {
    Optional<PersonEntity> findByObjectId(final UUID objectId);
}
