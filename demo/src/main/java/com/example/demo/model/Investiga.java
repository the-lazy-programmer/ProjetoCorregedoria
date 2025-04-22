package com.example.demo.model;

import jakarta.persistence.*;

@Entity
@Table(name = "investiga", schema = "corregedoria", indexes = {
        @Index(name = "delegadoMatricula", columnList = "delegadoMatricula"),
        @Index(name = "inqueritoNumero", columnList = "inqueritoNumero"),
        @Index(name = "casoNumero", columnList = "casoNumero")
})
public class Investiga {
    @EmbeddedId
    private InvestigaId id;

    @MapsId("investigadorMatricula")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "investigadorMatricula", nullable = false)
    private Investigador investigadorMatricula;

    @MapsId("delegadoMatricula")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "delegadoMatricula", nullable = false)
    private Delegado delegadoMatricula;

    @MapsId("inqueritoNumero")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "inqueritoNumero", nullable = false)
    private Inquerito inqueritoNumero;

    @MapsId("casoNumero")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "casoNumero", nullable = false)
    private Caso casoNumero;

    public InvestigaId getId() {
        return id;
    }

    public void setId(InvestigaId id) {
        this.id = id;
    }

    public Investigador getInvestigadorMatricula() {
        return investigadorMatricula;
    }

    public void setInvestigadorMatricula(Investigador investigadorMatricula) {
        this.investigadorMatricula = investigadorMatricula;
    }

    public Delegado getDelegadoMatricula() {
        return delegadoMatricula;
    }

    public void setDelegadoMatricula(Delegado delegadoMatricula) {
        this.delegadoMatricula = delegadoMatricula;
    }

    public Inquerito getInqueritoNumero() {
        return inqueritoNumero;
    }

    public void setInqueritoNumero(Inquerito inqueritoNumero) {
        this.inqueritoNumero = inqueritoNumero;
    }

    public Caso getCasoNumero() {
        return casoNumero;
    }

    public void setCasoNumero(Caso casoNumero) {
        this.casoNumero = casoNumero;
    }

}