package com.prince.MiniSIGA.service;

import com.prince.MiniSIGA.model.entity.CursoUfrj;
import com.prince.MiniSIGA.repository.CursoUfrjRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CursoService {

    @Autowired
    private CursoUfrjRepository cursoUfrjRepository;

    public CursoUfrj recuperarCursoByNum(String num) {
        return cursoUfrjRepository.getCursoUfrjEntityByCodigoMec(num);
    }
}
