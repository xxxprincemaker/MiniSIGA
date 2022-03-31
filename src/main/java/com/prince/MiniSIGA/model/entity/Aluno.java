package com.prince.MiniSIGA.model.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "Aluno", schema = "prince")
public class Aluno {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private String id;
    @Basic
    @Column(name = "nome")
    private String nome;
    @Basic
    @Column(name = "cpf")
    private String cpf;
    @Basic
    @Column(name = "matriculaDRE")
    private String matriculaDre;

    @Basic
    @Column(name = "curso_id")
    private String cursoId;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getMatriculaDre() {
        return matriculaDre;
    }

    public void setMatriculaDre(String matriculaDre) {
        this.matriculaDre = matriculaDre;
    }

    public String getCursoId() {
        return cursoId;
    }

    public void setCursoId(String cursoId) {
        this.cursoId = cursoId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aluno that = (Aluno) o;
        return Objects.equals(id, that.id) && Objects.equals(nome, that.nome) && Objects.equals(cpf, that.cpf) && Objects.equals(matriculaDre, that.matriculaDre) && Objects.equals(cursoId, that.cursoId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome, cpf, matriculaDre, cursoId);
    }
}
