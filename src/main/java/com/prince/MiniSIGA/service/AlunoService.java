package com.prince.MiniSIGA.service;

import com.prince.MiniSIGA.model.entity.Aluno;
import com.prince.MiniSIGA.repository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AlunoService {

    @Autowired
    AlunoRepository alunoRepository;

    public Aluno getAlunoByName(String name) {
        return alunoRepository.getAlunoEntityByNome(name);
    }

    public Aluno getAlunoByCPF(String name) {
        return alunoRepository.getAlunoEntityByCpf(name);
    }

    public void cadastrar(Aluno aluno) {
        alunoRepository.save(aluno);
    }

    public void deletar(Aluno aluno) {
        alunoRepository.delete(aluno);
    }

    public void update(Aluno aluno) {
        alunoRepository.save(aluno);
    }
}
