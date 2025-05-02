package com.adrian.demojpa.infrastructure.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.adrian.demojpa.domain.Project;

public interface ProjectRepository extends JpaRepository<Project, Long>{
    
}
