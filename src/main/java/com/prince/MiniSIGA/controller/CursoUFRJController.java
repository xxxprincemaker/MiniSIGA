package com.prince.MiniSIGA.controller;

import com.prince.MiniSIGA.model.entity.CursoUfrj;
import com.prince.MiniSIGA.service.CursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/curso")
public class CursoUFRJController {

    @Autowired
    private CursoService cursoService;

    @GetMapping(path = "{numCurso}", produces = "application/json")
    public CursoUfrj recuperarCursoPorNumero(@PathVariable String numCurso) {
        return cursoService.recuperarCursoByNum(numCurso);
    }
}
