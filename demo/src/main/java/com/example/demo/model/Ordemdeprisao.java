package com.example.demo.model;

import jakarta.persistence.*;

@Entity
@Table(name = "ordemdeprisao", schema = "corregedoria", indexes = {
        @Index(name = "casoNumero", columnList = "casoNumero"),
        @Index(name = "detenteMatricula", columnList = "detenteMatricula")
})
public class Ordemdeprisao {
    @EmbeddedId
    private OrdemdeprisaoId id;

    @MapsId("apfNumero")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "apfNumero", nullable = false)
    private Apf apfNumero;

    @MapsId("casoNumero")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "casoNumero", nullable = false)
    private Caso casoNumero;

    @MapsId("detenteMatricula")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "detenteMatricula", nullable = false)
    private Detente detenteMatricula;

    @Column(name = "aprovadoPelaJustica")
    private Boolean aprovadoPelaJustica;

    public OrdemdeprisaoId getId() {
        return id;
    }

    public void setId(OrdemdeprisaoId id) {
        this.id = id;
    }

    public Apf getApfNumero() {
        return apfNumero;
    }

    public void setApfNumero(Apf apfNumero) {
        this.apfNumero = apfNumero;
    }

    public Caso getCasoNumero() {
        return casoNumero;
    }

    public void setCasoNumero(Caso casoNumero) {
        this.casoNumero = casoNumero;
    }

    public Detente getDetenteMatricula() {
        return detenteMatricula;
    }

    public void setDetenteMatricula(Detente detenteMatricula) {
        this.detenteMatricula = detenteMatricula;
    }

    public Boolean getAprovadoPelaJustica() {
        return aprovadoPelaJustica;
    }

    public void setAprovadoPelaJustica(Boolean aprovadoPelaJustica) {
        this.aprovadoPelaJustica = aprovadoPelaJustica;
    }

}