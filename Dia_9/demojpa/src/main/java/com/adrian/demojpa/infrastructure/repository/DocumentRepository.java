package com.adrian.demojpa.infrastructure.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.adrian.demojpa.domain.Passport;

public interface DocumentRepository extends JpaRepository<Passport, Long>{


}
