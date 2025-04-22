package com.example.demo.model;

import jakarta.persistence.*;

@Entity
@Table(name = "abre", schema = "corregedoria", indexes = {
        @Index(name = "apfNumero", columnList = "apfNumero"),
        @Index(name = "inqueritoNumero", columnList = "inqueritoNumero")
})
public class Abre {
    @EmbeddedId
    private AbreId id;

    @MapsId("delegadoMatricula")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "delegadoMatricula", nullable = false)
    private Delegado delegadoMatricula;

    @MapsId("apfNumero")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "apfNumero", nullable = false)
    private Apf apfNumero;

    @MapsId("inqueritoNumero")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "inqueritoNumero", nullable = false)
    private Inquerito inqueritoNumero;

    public AbreId getId() {
        return id;
    }

    public void setId(AbreId id) {
        this.id = id;
    }

    public Delegado getDelegadoMatricula() {
        return delegadoMatricula;
    }

    public void setDelegadoMatricula(Delegado delegadoMatricula) {
        this.delegadoMatricula = delegadoMatricula;
    }

    public Apf getApfNumero() {
        return apfNumero;
    }

    public void setApfNumero(Apf apfNumero) {
        this.apfNumero = apfNumero;
    }

    public Inquerito getInqueritoNumero() {
        return inqueritoNumero;
    }

    public void setInqueritoNumero(Inquerito inqueritoNumero) {
        this.inqueritoNumero = inqueritoNumero;
    }

}