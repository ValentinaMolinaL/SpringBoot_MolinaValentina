package com.adrian.demojpa.infrastructure.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.adrian.demojpa.application.service.PersonService;

@RestController
@RequestMapping(value = "/api", produces = MediaType.APPLICATION_JSON_VALUE)
public class DocumentController {
    private final PersonService personService;

    public DocumentController(PersonService personService) {
        this.personService = personService;
    }
}
