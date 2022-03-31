package com.prince.MiniSIGA.service;

import com.prince.MiniSIGA.model.entity.CursoUfrjEntity;
import com.prince.MiniSIGA.repository.CursoUfrjEntityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CursoService {

    @Autowired
    private CursoUfrjEntityRepository cursoUfrjEntityRepository;

    public CursoUfrjEntity recuperarCursoByNum(String num) {
        return cursoUfrjEntityRepository.getCursoUfrjEntityByCodigoMec(num);
    }
}
