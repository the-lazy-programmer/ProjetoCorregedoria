package com.example.demo.model;

import jakarta.persistence.*;

import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "delegado", schema = "corregedoria")
public class Delegado {
    @Id
    @Column(name = "investigativoMatricula", nullable = false, length = 45)
    private String investigativoMatricula;

    @MapsId
    @OneToOne
    @JoinColumn(name = "matricula")
    private Investigativo investigativo;

    @OneToMany(mappedBy = "delegadoMatricula")
    private Set<Abre> abres = new LinkedHashSet<>();

    @OneToMany(mappedBy = "delegadoMatricula")
    private Set<Avalia> avalias = new LinkedHashSet<>();

    @OneToMany(mappedBy = "delegadoMatricula")
    private Set<Investiga> investigas = new LinkedHashSet<>();

    public String getInvestigativoMatricula() {
        return investigativoMatricula;
    }

    public void setInvestigativoMatricula(String investigativoMatricula) {
        this.investigativoMatricula = investigativoMatricula;
    }

    public Investigativo getInvestigativo() {
        return investigativo;
    }

    public void setInvestigativo(Investigativo investigativo) {
        this.investigativo = investigativo;
    }

    public Set<Abre> getAbres() {
        return abres;
    }

    public void setAbres(Set<Abre> abres) {
        this.abres = abres;
    }

    public Set<Avalia> getAvalias() {
        return avalias;
    }

    public void setAvalias(Set<Avalia> avalias) {
        this.avalias = avalias;
    }

    public Set<Investiga> getInvestigas() {
        return investigas;
    }

    public void setInvestigas(Set<Investiga> investigas) {
        this.investigas = investigas;
    }

}