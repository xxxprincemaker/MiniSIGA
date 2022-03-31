package com.prince.MiniSIGA.controller;

import com.prince.MiniSIGA.model.entity.Aluno;
import com.prince.MiniSIGA.service.AlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/aluno")
public class AlunoController {

    @Autowired
    private AlunoService alunoService;

    @GetMapping(path = "/{alunoNome}", produces = "application/json")
    public Aluno recuperarAlunoEntity(@PathVariable String alunoNome) {
        return alunoService.getAlunoByName(alunoNome);
    }

    @GetMapping(path = "cpf/{cpf}", produces = "application/json")
    public Aluno recuperarAlunoEntityByCPF(@PathVariable String cpf) {
        return alunoService.getAlunoByCPF(cpf);
    }

    @PostMapping(path = "cadastrar", consumes = "application/json", produces = "application/json")
    public void cadastrarAluno(@RequestBody Aluno aluno) {
        alunoService.cadastrar(aluno);
    }

    @DeleteMapping(path = "deletar", consumes = "application/json", produces = "application/json")
    public void deletarAluno(@RequestBody Aluno aluno) {
        alunoService.deletar(aluno);
    }

    @PutMapping(path = "atualizar", consumes = "application/json", produces = "application/json")
    public void updateAluno(@RequestBody Aluno aluno) {
        alunoService.update(aluno);
    }
}
