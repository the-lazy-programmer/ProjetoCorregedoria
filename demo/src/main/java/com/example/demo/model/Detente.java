package com.example.demo.model;

import jakarta.persistence.*;

import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "detente", schema = "corregedoria")
public class Detente {
    @Id
    @Column(name = "matricula", nullable = false, length = 45)
    private String matricula;

    @Column(name = "nome", length = 45)
    private String nome;

    @Column(name = "preso")
    private Boolean preso;

    @OneToMany(mappedBy = "detenteMatricula")
    private Set<Denuncia> denuncias = new LinkedHashSet<>();

    @ManyToMany(mappedBy = "detentes")
    private Set<Caso> casos = new LinkedHashSet<>();

    @OneToMany(mappedBy = "detenteMatricula")
    private Set<Ordemdeprisao> ordemdeprisaos = new LinkedHashSet<>();

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Boolean getPreso() {
        return preso;
    }

    public void setPreso(Boolean preso) {
        this.preso = preso;
    }

    public Set<Denuncia> getDenuncias() {
        return denuncias;
    }

    public void setDenuncias(Set<Denuncia> denuncias) {
        this.denuncias = denuncias;
    }

    public Set<Caso> getCasos() {
        return casos;
    }

    public void setCasos(Set<Caso> casos) {
        this.casos = casos;
    }

    public Set<Ordemdeprisao> getOrdemdeprisaos() {
        return ordemdeprisaos;
    }

    public void setOrdemdeprisaos(Set<Ordemdeprisao> ordemdeprisaos) {
        this.ordemdeprisaos = ordemdeprisaos;
    }

}