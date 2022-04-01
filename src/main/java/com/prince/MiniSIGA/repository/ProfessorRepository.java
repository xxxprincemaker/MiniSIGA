package com.prince.MiniSIGA.repository;

import com.prince.MiniSIGA.model.entity.Professor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfessorRepository extends JpaRepository<Professor, String> {
}