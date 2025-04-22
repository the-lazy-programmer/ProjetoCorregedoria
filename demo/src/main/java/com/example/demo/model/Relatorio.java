package com.example.demo.model;

import jakarta.persistence.*;

import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "relatorio", schema = "corregedoria")
public class Relatorio {
    @Id
    @Column(name = "numero", nullable = false, length = 45)
    private String numero;

    @Column(name = "aprovado_pela_justica")
    private Boolean aprovadoPelaJustica;

    @OneToMany(mappedBy = "relatorioNumero")
    private Set<Fazpartede> fazpartedes = new LinkedHashSet<>();

    @OneToMany(mappedBy = "relatorioNumero")
    private Set<Relatar> relatars = new LinkedHashSet<>();

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

    public Set<Fazpartede> getFazpartedes() {
        return fazpartedes;
    }

    public void setFazpartedes(Set<Fazpartede> fazpartedes) {
        this.fazpartedes = fazpartedes;
    }

    public Set<Relatar> getRelatars() {
        return relatars;
    }

    public void setRelatars(Set<Relatar> relatars) {
        this.relatars = relatars;
    }

}