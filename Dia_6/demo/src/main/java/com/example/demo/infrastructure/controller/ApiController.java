package com.example.demo.infrastructure.controller;

import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.application.service.PersonService;
import com.example.demo.domain.Person;

import org.springframework.web.bind.annotation.GetMapping;


@RestController  
@RequestMapping(value = "/api", produces = MediaType.APPLICATION_JSON_VALUE)
public class ApiController{ 

    private final PersonService personService;

    public ApiController(PersonService personRepository) {
        this.personService = personRepository;
    }


    @GetMapping("/users")
    public List<Person> findAll(        
        @RequestParam(name= "filter", defaultValue = "") String filter,
        @RequestParam (name = "value", defaultValue = "") String value
    ) {
        // List<Person> results = personRepository.findAll();
        List<Person> results = personService.findAllByFilter(filter, value);
        return results;
    }
}