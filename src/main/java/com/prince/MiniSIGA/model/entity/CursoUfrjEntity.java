package com.prince.MiniSIGA.model.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "CursoUFRJ", schema = "prince", catalog = "")
public class CursoUfrjEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private String id;
    @Basic
    @Column(name = "nome")
    private String nome;
    @Basic
    @Column(name = "nível")
    private String nível;
    @Basic
    @Column(name = "unidade")
    private String unidade;
    @Basic
    @Column(name = "codigoMEC")
    private String codigoMec;
    @Basic
    @Column(name = "data_criacao")
    private Timestamp dataCriacao;
    @Basic
    @Column(name = "ativo")
    private Boolean ativo;
    @Basic
    @Column(name = "coordenador_id")
    private String coordenadorId;

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

    public String getNível() {
        return nível;
    }

    public void setNível(String nível) {
        this.nível = nível;
    }

    public String getUnidade() {
        return unidade;
    }

    public void setUnidade(String unidade) {
        this.unidade = unidade;
    }

    public String getCodigoMec() {
        return codigoMec;
    }

    public void setCodigoMec(String codigoMec) {
        this.codigoMec = codigoMec;
    }

    public Timestamp getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(Timestamp dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public Boolean getAtivo() {
        return ativo;
    }

    public void setAtivo(Boolean ativo) {
        this.ativo = ativo;
    }

    public String getCoordenadorId() {
        return coordenadorId;
    }

    public void setCoordenadorId(String coordenadorId) {
        this.coordenadorId = coordenadorId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CursoUfrjEntity that = (CursoUfrjEntity) o;
        return Objects.equals(id, that.id) && Objects.equals(nome, that.nome) && Objects.equals(nível, that.nível) && Objects.equals(unidade, that.unidade) && Objects.equals(codigoMec, that.codigoMec) && Objects.equals(dataCriacao, that.dataCriacao) && Objects.equals(ativo, that.ativo) && Objects.equals(coordenadorId, that.coordenadorId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome, nível, unidade, codigoMec, dataCriacao, ativo, coordenadorId);
    }
}
