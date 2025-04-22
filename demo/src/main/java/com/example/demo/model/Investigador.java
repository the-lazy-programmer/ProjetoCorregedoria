package com.example.demo.model;

import jakarta.persistence.*;

import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "investigador", schema = "corregedoria")
public class Investigador {
    @Id
    @Column(name = "investigativoMatricula", nullable = false, length = 45)
    private String investigativoMatricula;

    @MapsId
    @OneToOne
    @JoinColumn(name = "matricula")
    private Investigativo investigativo;

    @OneToMany(mappedBy = "investigadorMatricula")
    private Set<Investiga> investigas = new LinkedHashSet<>();

    @OneToMany(mappedBy = "investigadorMatricula")
    private Set<Relatar> relatars = new LinkedHashSet<>();

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

    public Set<Investiga> getInvestigas() {
        return investigas;
    }

    public void setInvestigas(Set<Investiga> investigas) {
        this.investigas = investigas;
    }

    public Set<Relatar> getRelatars() {
        return relatars;
    }

    public void setRelatars(Set<Relatar> relatars) {
        this.relatars = relatars;
    }

}