package com.example.demo.model;

import jakarta.persistence.*;

import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "caso", schema = "corregedoria")
public class Caso {
    @Id
    @Column(name = "numero", nullable = false, length = 45)
    private String numero;

    @Column(name = "nome", length = 45)
    private String nome;

    @ManyToMany
    @JoinTable(name = "examina",
            joinColumns = @JoinColumn(name = "casoNumero"),
            inverseJoinColumns = @JoinColumn(name = "detenteMatricula"))
    private Set<Detente> detentes = new LinkedHashSet<>();

    @OneToMany(mappedBy = "casoNumero")
    private Set<Fazpartede> fazpartedes = new LinkedHashSet<>();

    @OneToMany(mappedBy = "casoNumero")
    private Set<Investiga> investigas = new LinkedHashSet<>();

    @OneToMany(mappedBy = "casoNumero")
    private Set<Ordemdeprisao> ordemdeprisaos = new LinkedHashSet<>();

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Detente> getDetentes() {
        return detentes;
    }

    public void setDetentes(Set<Detente> detentes) {
        this.detentes = detentes;
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

    public Set<Ordemdeprisao> getOrdemdeprisaos() {
        return ordemdeprisaos;
    }

    public void setOrdemdeprisaos(Set<Ordemdeprisao> ordemdeprisaos) {
        this.ordemdeprisaos = ordemdeprisaos;
    }

}