package com.adrian.demojpa.infrastructure.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.adrian.demojpa.domain.Person;

public interface PersonRepository extends JpaRepository<Person, Long> {
    List<Person> findByNameContains(String name);
    List<Person> findByLanguageEquals(String name);
    Optional<Person> findPersonByPassportNumber(String number);
}