package com.prince.MiniSIGA.service;

import com.prince.MiniSIGA.model.entity.Aluno;
import com.prince.MiniSIGA.repository.AlunoEntityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AlunoService {

    @Autowired
    AlunoEntityRepository alunoEntityRepository;

    public Aluno getAlunoByName(String name) {
        return alunoEntityRepository.getAlunoEntityByNome(name);
    }

    public Aluno getAlunoByCPF(String name) {
        return alunoEntityRepository.getAlunoEntityByCpf(name);
    }

    public void cadastrar(Aluno aluno) {
        alunoEntityRepository.save(aluno);
    }

    public void deletar(Aluno aluno) {
        alunoEntityRepository.delete(aluno);
    }

    public void update(Aluno aluno) {
        alunoEntityRepository.save(aluno);
    }
}
