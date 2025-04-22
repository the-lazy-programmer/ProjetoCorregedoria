package com.example.demo.model;

import jakarta.persistence.*;

@Entity
@Table(name = "relatar", schema = "corregedoria", indexes = {
        @Index(name = "escrivaoMatricula", columnList = "escrivaoMatricula"),
        @Index(name = "investigadorMatricula", columnList = "investigadorMatricula")
})
public class Relatar {
    @EmbeddedId
    private RelatarId id;

    @MapsId("relatorioNumero")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "relatorioNumero", nullable = false)
    private Relatorio relatorioNumero;

    @MapsId("escrivaoMatricula")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "escrivaoMatricula", nullable = false)
    private Escrivao escrivaoMatricula;

    @MapsId("investigadorMatricula")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "investigadorMatricula", nullable = false)
    private Investigador investigadorMatricula;

    public RelatarId getId() {
        return id;
    }

    public void setId(RelatarId id) {
        this.id = id;
    }

    public Relatorio getRelatorioNumero() {
        return relatorioNumero;
    }

    public void setRelatorioNumero(Relatorio relatorioNumero) {
        this.relatorioNumero = relatorioNumero;
    }

    public Escrivao getEscrivaoMatricula() {
        return escrivaoMatricula;
    }

    public void setEscrivaoMatricula(Escrivao escrivaoMatricula) {
        this.escrivaoMatricula = escrivaoMatricula;
    }

    public Investigador getInvestigadorMatricula() {
        return investigadorMatricula;
    }

    public void setInvestigadorMatricula(Investigador investigadorMatricula) {
        this.investigadorMatricula = investigadorMatricula;
    }

}