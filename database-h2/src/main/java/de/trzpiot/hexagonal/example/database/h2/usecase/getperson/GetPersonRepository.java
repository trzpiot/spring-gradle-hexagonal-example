package de.trzpiot.hexagonal.example.database.h2.usecase.getperson;

import de.trzpiot.hexagonal.example.database.h2.domain.PersonEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
interface GetPersonRepository extends JpaRepository<PersonEntity, Long> {
    Optional<PersonEntity> findByObjectId(final UUID objectId);
}
