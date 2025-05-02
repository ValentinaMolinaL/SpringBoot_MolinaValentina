package com.adrian.demojpa.application.service;

import java.util.List;

import com.adrian.demojpa.domain.Project;

public interface ProjectService {
    List<Project> findAllProjects();
}
