package com.prince.MiniSIGA.controller;

import com.prince.MiniSIGA.model.entity.Aluno;
import com.prince.MiniSIGA.service.AlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/aluno")
public class AlunoController {

    @Autowired
    private AlunoService alunoService;

    @GetMapping(path = "/{alunoNome}",produces = "application/json")
    public Aluno recuperarAlunoEntity(@PathVariable String alunoNome){
        return alunoService.getAlunoByName(alunoNome);
    }
    @GetMapping(path = "cpf/{cpf}",produces = "application/json")
    public Aluno recuperarAlunoEntityByCPF(@PathVariable String cpf){
        return alunoService.getAlunoByCPF(cpf);
    }
}
