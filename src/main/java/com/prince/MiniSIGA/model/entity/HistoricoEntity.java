package com.prince.MiniSIGA.model.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "Historico", schema = "prince", catalog = "")
public class HistoricoEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private String id;
    @Basic
    @Column(name = "aluno_id")
    private String alunoId;
    @Basic
    @Column(name = "dataIngresso")
    private Timestamp dataIngresso;
    @Basic
    @Column(name = "cr_medio")
    private Double crMedio;

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

    public Timestamp getDataIngresso() {
        return dataIngresso;
    }

    public void setDataIngresso(Timestamp dataIngresso) {
        this.dataIngresso = dataIngresso;
    }

    public Double getCrMedio() {
        return crMedio;
    }

    public void setCrMedio(Double crMedio) {
        this.crMedio = crMedio;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HistoricoEntity that = (HistoricoEntity) o;
        return Objects.equals(id, that.id) && Objects.equals(alunoId, that.alunoId) && Objects.equals(dataIngresso, that.dataIngresso) && Objects.equals(crMedio, that.crMedio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, alunoId, dataIngresso, crMedio);
    }
}
