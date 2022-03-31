package com.prince.MiniSIGA.repository;

import com.prince.MiniSIGA.model.entity.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface AlunoEntityRepository extends JpaRepository<Aluno, String> {

    Aluno getAlunoEntityByNome(String nome);

    @Query("""
            select a from  Aluno as a
            where a.cpf = :cpf
            """)
    Aluno getAlunoEntityByCpf(String cpf);
}