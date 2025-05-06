package com.adrian.demojpa.infrastructure.controller;

import java.util.List;

import org.springframework.http.HttpStatusCode;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.adrian.demojpa.application.service.PersonService;
import com.adrian.demojpa.domain.Person;
import com.adrian.demojpa.domain.dto.PersonRequest;
import com.adrian.demojpa.domain.dto.PersonResponse;

import jakarta.validation.Valid;

import org.springframework.web.bind.annotation.PostMapping;


@RestController
@RequestMapping(value = "/api", produces = MediaType.APPLICATION_JSON_VALUE)
public class UsersController {

    private final PersonService personService;

    public UsersController(PersonService personService) {
        this.personService = personService;
    }

    @GetMapping("/users")    
    public List<PersonResponse> findAllUser(
        @RequestParam(name= "filter", defaultValue = "") String filter,
        @RequestParam(name="value", defaultValue = "") String value
    ) {

        List<PersonResponse> results = personService.findAllUsersByFilter(filter, value);

        return results;
    }

    @PostMapping("/users")
    public ResponseEntity<PersonResponse> craeteNewUser(@Valid 
    @RequestBody PersonRequest personDto) {
        return new ResponseEntity<PersonResponse>(
            personService.createNewUser(personDto),
            HttpStatusCode.valueOf(201)

        );
    }

    @PatchMapping("/users/{id}")
    public ResponseEntity<PersonResponse> parcialUpdatePerson(@PathVariable Long id, @RequestBody PersonRequest personDto) {
        return ResponseEntity.ok().body(personService.patchPerson(id, personDto));
        //return ResponseEntity.noContent().build();
    }
}
