package com.example.demo.model;

import jakarta.persistence.*;

import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "documento", schema = "corregedoria")
public class Documento {
    @Id
    @Column(name = "numero", nullable = false, length = 45)
    private String numero;

    @ManyToMany
    private Set<Escrivao> escrivaos = new LinkedHashSet<>();

    @OneToMany(mappedBy = "documentoNumero")
    private Set<Fazpartede> fazpartedes = new LinkedHashSet<>();

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Set<Escrivao> getEscrivaos() {
        return escrivaos;
    }

    public void setEscrivaos(Set<Escrivao> escrivaos) {
        this.escrivaos = escrivaos;
    }

    public Set<Fazpartede> getFazpartedes() {
        return fazpartedes;
    }

    public void setFazpartedes(Set<Fazpartede> fazpartedes) {
        this.fazpartedes = fazpartedes;
    }

}