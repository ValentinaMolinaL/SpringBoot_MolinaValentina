package com.example.demo.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity //hace que tome a person como una entidad 
@Table(name="personas") //Para crear la tabla person 
public class Person {
    
    @Id // declaracion de primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY) // declaracion de autoincrement
    private long id;
    private String name;
    private String lastName;

    @Column(name = "programming_language") // renombrar la columna
    private String language;

    public Person() {
        
    }

    public Person(long id, String name, String lastName, String language) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.language = language;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }


}
