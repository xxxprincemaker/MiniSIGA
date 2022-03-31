package com.prince.MiniSIGA.model.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "AlunoTurma", schema = "prince", catalog = "")
public class AlunoTurmaEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private String id;
    @Basic
    @Column(name = "aluno_id")
    private String alunoId;
    @Basic
    @Column(name = "turma_id")
    private String turmaId;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAlunoId() {
        return alunoId;
    }

    public void setAlunoId(String alunoId) {
        this.alunoId = alunoId;
    }

    public String getTurmaId() {
        return turmaId;
    }

    public void setTurmaId(String turmaId) {
        this.turmaId = turmaId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AlunoTurmaEntity that = (AlunoTurmaEntity) o;
        return Objects.equals(id, that.id) && Objects.equals(alunoId, that.alunoId) && Objects.equals(turmaId, that.turmaId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, alunoId, turmaId);
    }
}
