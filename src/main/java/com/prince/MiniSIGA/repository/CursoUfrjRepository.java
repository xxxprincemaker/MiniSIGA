package com.prince.MiniSIGA.repository;

import com.prince.MiniSIGA.model.entity.CursoUfrj;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CursoUfrjRepository extends JpaRepository<CursoUfrj, String> {

    CursoUfrj getCursoUfrjEntityByCodigoMec(String codigoMec);
}