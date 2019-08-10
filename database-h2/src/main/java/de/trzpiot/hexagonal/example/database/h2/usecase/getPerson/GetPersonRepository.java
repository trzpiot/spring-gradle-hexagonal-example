package de.trzpiot.hexagonal.example.database.h2.usecase.getPerson;

import de.trzpiot.hexagonal.example.database.h2.domain.PersonEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
interface GetPersonRepository extends JpaRepository<PersonEntity, Long> {
}
