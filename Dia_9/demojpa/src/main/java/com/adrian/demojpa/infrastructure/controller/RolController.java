package com.adrian.demojpa.infrastructure.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.adrian.demojpa.application.service.PersonService;
import com.adrian.demojpa.application.service.ProjectService;
import com.adrian.demojpa.application.service.RolService;

import com.adrian.demojpa.domain.Rol;
import com.adrian.demojpa.domain.RoleRequest;


import jakarta.validation.Valid;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping(value = "/api", produces = MediaType.APPLICATION_JSON_VALUE)
public class RolController {


    private final RolService rolService;

    
    public RolController(PersonService personService, RolService rolService, ProjectService projectService) {
        this.rolService = rolService;
    }

    @GetMapping("/roles")    
    public ResponseEntity<List<Rol>> findAllRoles(
        @RequestParam(name= "filter", defaultValue = "") String filter,
        @RequestParam(name="value", defaultValue = "") String value
    ) {

        List<Rol> results = rolService.findAllRolesByFilter(filter, value);

        return ResponseEntity.ok(results);
    }

    @PostMapping("/roles")
    @ResponseStatus(HttpStatus.CREATED)
    public Rol newRole(@Valid @RequestBody RoleRequest role) {
        return rolService.createNewRol(role.getName());
    }

    @DeleteMapping("/roles/{id}")
    public ResponseEntity<Rol> removeRol(@PathVariable(name = "id") Long id) {
        return ResponseEntity.ok().body(rolService.removeRol(id));
    }
}
