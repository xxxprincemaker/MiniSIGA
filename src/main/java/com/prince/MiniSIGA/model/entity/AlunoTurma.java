package com.prince.MiniSIGA.model.entity;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.Objects;
import java.util.UUID;

@Entity
@Table(name = "AlunoTurma", schema = "prince", catalog = "")
public class AlunoTurma {
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    @Id
    @Column(name = "id", updatable = false, nullable = false, columnDefinition = "VARCHAR(255)")
    @Type(type = "uuid-char")
    private UUID id;
    @Basic
    @Column(name = "aluno_id")
    private String alunoId;
    @Basic
    @Column(name = "turma_id")
    private String turmaId;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
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
        AlunoTurma that = (AlunoTurma) o;
        return Objects.equals(id, that.id) && Objects.equals(alunoId, that.alunoId) && Objects.equals(turmaId, that.turmaId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, alunoId, turmaId);
    }
}
