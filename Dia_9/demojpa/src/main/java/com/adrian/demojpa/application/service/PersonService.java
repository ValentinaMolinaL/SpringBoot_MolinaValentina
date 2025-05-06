package com.adrian.demojpa.application.service;

import java.util.List;


import com.adrian.demojpa.domain.Person;
import com.adrian.demojpa.domain.dto.PersonRequest;
import com.adrian.demojpa.domain.dto.PersonResponse;

public interface PersonService {
    public List<PersonResponse> findAllUsersByFilter(String filter, String value);
    public PersonResponse patchPerson(Long id, PersonRequest personDto);
    public PersonResponse createNewUser(PersonRequest personDto);
}
