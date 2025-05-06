package com.adrian.demojpa.domain;

import java.io.Serializable;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;


public class RoleRequest implements Serializable {

    @NotBlank(message = "El nombre del Rol es requerido")
    @Size(min = 1, max = 10)
    @NotNull(message = "El nombre del Rol es requerido")
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
