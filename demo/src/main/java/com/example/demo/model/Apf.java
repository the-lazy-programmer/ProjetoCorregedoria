package com.example.demo.model;

import jakarta.persistence.*;

import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "apf", schema = "corregedoria")
public class Apf {
    @Id
    @Column(name = "numero", nullable = false, length = 45)
    private String numero;

    @Column(name = "aprovadoPelaJustica")
    private Boolean aprovadoPelaJustica;

    @OneToMany(mappedBy = "apfNumero")
    private Set<Abre> abres = new LinkedHashSet<>();

    @OneToMany(mappedBy = "apfNumero")
    private Set<Ordemdeprisao> ordemdeprisaos = new LinkedHashSet<>();

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Boolean getAprovadoPelaJustica() {
        return aprovadoPelaJustica;
    }

    public void setAprovadoPelaJustica(Boolean aprovadoPelaJustica) {
        this.aprovadoPelaJustica = aprovadoPelaJustica;
    }

    public Set<Abre> getAbres() {
        return abres;
    }

    public void setAbres(Set<Abre> abres) {
        this.abres = abres;
    }

    public Set<Ordemdeprisao> getOrdemdeprisaos() {
        return ordemdeprisaos;
    }

    public void setOrdemdeprisaos(Set<Ordemdeprisao> ordemdeprisaos) {
        this.ordemdeprisaos = ordemdeprisaos;
    }

}