package com.example.demo.model;

import jakarta.persistence.*;

import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "escrivao", schema = "corregedoria")
public class Escrivao {
    @Id
    @Column(name = "investigativoMatricula", nullable = false, length = 45)
    private String investigativoMatricula;

    @MapsId
    @OneToOne
    @JoinColumn(name = "matricula")
    private Investigativo investigativo;

    @ManyToMany
    private Set<Documento> documentos = new LinkedHashSet<>();

    @OneToMany(mappedBy = "escrivaoMatricula")
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

    public Set<Documento> getDocumentos() {
        return documentos;
    }

    public void setDocumentos(Set<Documento> documentos) {
        this.documentos = documentos;
    }

    public Set<Relatar> getRelatars() {
        return relatars;
    }

    public void setRelatars(Set<Relatar> relatars) {
        this.relatars = relatars;
    }

}