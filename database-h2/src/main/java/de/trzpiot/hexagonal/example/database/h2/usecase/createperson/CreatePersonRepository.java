package de.trzpiot.hexagonal.example.database.h2.usecase.createperson;

import de.trzpiot.hexagonal.example.database.h2.domain.PersonEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
interface CreatePersonRepository extends JpaRepository<PersonEntity, Long> {

}
