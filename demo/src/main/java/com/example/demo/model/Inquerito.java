package com.example.demo.model;

import jakarta.persistence.*;

import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "inquerito", schema = "corregedoria")
public class Inquerito {
    @Id
    @Column(name = "numero", nullable = false, length = 45)
    private String numero;

    @OneToMany(mappedBy = "inqueritoNumero")
    private Set<Abre> abres = new LinkedHashSet<>();

    @OneToMany(mappedBy = "inqueritoNumero")
    private Set<Fazpartede> fazpartedes = new LinkedHashSet<>();

    @OneToMany(mappedBy = "inqueritoNumero")
    private Set<Investiga> investigas = new LinkedHashSet<>();

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Set<Abre> getAbres() {
        return abres;
    }

    public void setAbres(Set<Abre> abres) {
        this.abres = abres;
    }

    public Set<Fazpartede> getFazpartedes() {
        return fazpartedes;
    }

    public void setFazpartedes(Set<Fazpartede> fazpartedes) {
        this.fazpartedes = fazpartedes;
    }

    public Set<Investiga> getInvestigas() {
        return investigas;
    }

    public void setInvestigas(Set<Investiga> investigas) {
        this.investigas = investigas;
    }

}