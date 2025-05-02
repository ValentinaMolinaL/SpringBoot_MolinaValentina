package com.adrian.demojpa.domain;


import java.util.ArrayList;
import java.util.List;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ForeignKey;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "personas")
@EqualsAndHashCode(exclude = {"role"})
@ToString(exclude = {"role"})
@Getter
@Setter
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "full_name", columnDefinition = "TEXT", length = 50, nullable = false)
    private String name;
    private String lastName;

    @Column(name = "programming_language")
    private String language;
    
    @ManyToOne(cascade = CascadeType.ALL)// Nivel de JPA
    @JoinColumn(name = "Rol_id", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE) //Nivel de base de datos
    @JsonBackReference //Marcar el lado que no se serializa
    private Rol role;

    @OneToOne(mappedBy = "person")
    @JsonManagedReference
    private Passport passport;

    @ManyToMany
    @JoinTable(
        name = "personas_project",
        joinColumns = @JoinColumn(name = "persona_id", foreignKey = @ForeignKey(name = "fk_persona_id_projects")),
        inverseJoinColumns = @JoinColumn(name = "project_id")
    )
    @JsonBackReference
    private List<Project> projects = new ArrayList<>();

    public Person() {

    }

    public Person(Long id, String name, String lastName, String language) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.language = language;
    }
}
