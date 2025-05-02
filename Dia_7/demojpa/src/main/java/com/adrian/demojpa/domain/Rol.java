package com.adrian.demojpa.domain;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "roles")
@Getter
@Setter
public class Rol {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    
    @OneToMany(mappedBy = "role", fetch = FetchType.EAGER)
    @JsonManagedReference//Marca el lado que si seralizamos
    private List<Person> persons = new ArrayList<>();

    public Rol() {}

    public Rol(Long id, String name) {
        this.id = id;
        this.name = name;
    }
    
}
