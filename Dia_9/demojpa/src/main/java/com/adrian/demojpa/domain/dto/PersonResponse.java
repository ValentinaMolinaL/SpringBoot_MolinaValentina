package com.adrian.demojpa.domain.dto;

public class PersonResponse {
    private String name, surname, skill;
    private boolean passport;

    public PersonResponse() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    public boolean isPassport() {
        return passport;
    }

    public void setPassport(boolean passport) {
        this.passport = passport;
    }

    
    
}
