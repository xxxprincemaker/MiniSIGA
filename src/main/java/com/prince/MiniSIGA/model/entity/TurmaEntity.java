package com.prince.MiniSIGA.model.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "Turma", schema = "prince", catalog = "")
public class TurmaEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private String id;
    @Basic
    @Column(name = "nome")
    private String nome;
    @Basic
    @Column(name = "codigo")
    private String codigo;
    @Basic
    @Column(name = "disciplina_id")
    private String disciplinaId;
    @Basic
    @Column(name = "professor_1_id")
    private String professor1Id;
    @Basic
    @Column(name = "professor_2_id")
    private String professor2Id;

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

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDisciplinaId() {
        return disciplinaId;
    }

    public void setDisciplinaId(String disciplinaId) {
        this.disciplinaId = disciplinaId;
    }

    public String getProfessor1Id() {
        return professor1Id;
    }

    public void setProfessor1Id(String professor1Id) {
        this.professor1Id = professor1Id;
    }

    public String getProfessor2Id() {
        return professor2Id;
    }

    public void setProfessor2Id(String professor2Id) {
        this.professor2Id = professor2Id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TurmaEntity that = (TurmaEntity) o;
        return Objects.equals(id, that.id) && Objects.equals(nome, that.nome) && Objects.equals(codigo, that.codigo) && Objects.equals(disciplinaId, that.disciplinaId) && Objects.equals(professor1Id, that.professor1Id) && Objects.equals(professor2Id, that.professor2Id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome, codigo, disciplinaId, professor1Id, professor2Id);
    }
}
