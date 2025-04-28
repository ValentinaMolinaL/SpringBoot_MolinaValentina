package com.example.demo.application.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.domain.Person;
import com.example.demo.infrastructure.repository.PersonRepository;

@Service
public class PersonService {

    private PersonRepository personRepository;

    public PersonService(PersonRepository personRepository){
        this.personRepository = personRepository;
    }

    public List<Person> findAllByFilter(String filter, String value){

        if (filter.toLowerCase().equals("name")  && !value.isEmpty()) {
            return personRepository.findByNameContains(value);
        } else if(filter.toLowerCase().equals("lenguage") && !value.isEmpty()){
            return personRepository.findByLanguageEquals(value);
        }
        return personRepository.findAll();
    }
}
