package com.adrian.demojpa.infrastructure.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.adrian.demojpa.domain.Rol;


public interface RoleRepository extends JpaRepository<Rol, Long>{
    Optional<Rol> findByName(String name);
}
