package com.example.demo.model;

import jakarta.persistence.*;

import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "funcionario", schema = "corregedoria")
public class Funcionario {
    @Id
    @Column(name = "matricula", nullable = false, length = 45)
    private String matricula;

    @Column(name = "nome", length = 45)
    private String nome;

    @ManyToMany(mappedBy = "funcionarios")
    private Set<Corregedoria> corregedorias = new LinkedHashSet<>();

    @OneToOne(mappedBy = "funcionario")
    private Investigativo investigativo;

    @OneToOne(mappedBy = "funcionario")
    private Secretaria secretaria;

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

    public Set<Corregedoria> getCorregedorias() {
        return corregedorias;
    }

    public void setCorregedorias(Set<Corregedoria> corregedorias) {
        this.corregedorias = corregedorias;
    }

    public Investigativo getInvestigativo() {
        return investigativo;
    }

    public void setInvestigativo(Investigativo investigativo) {
        this.investigativo = investigativo;
    }

    public Secretaria getSecretaria() {
        return secretaria;
    }

    public void setSecretaria(Secretaria secretaria) {
        this.secretaria = secretaria;
    }

}