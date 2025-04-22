package com.example.demo.model;

import jakarta.persistence.*;

import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "denunciante", schema = "corregedoria")
public class Denunciante {
    @Id
    @Column(name = "anonimo", nullable = false)
    private Boolean id = false;

    @OneToMany(mappedBy = "denuncianteAnonimo")
    private Set<Denuncia> denuncias = new LinkedHashSet<>();

    @OneToMany(mappedBy = "denuncianteAnonimo")
    private Set<Denunciantenaoanonimo> denunciantenaoanonimos = new LinkedHashSet<>();

    public Boolean getId() {
        return id;
    }

    public void setId(Boolean id) {
        this.id = id;
    }

    public Set<Denuncia> getDenuncias() {
        return denuncias;
    }

    public void setDenuncias(Set<Denuncia> denuncias) {
        this.denuncias = denuncias;
    }

    public Set<Denunciantenaoanonimo> getDenunciantenaoanonimos() {
        return denunciantenaoanonimos;
    }

    public void setDenunciantenaoanonimos(Set<Denunciantenaoanonimo> denunciantenaoanonimos) {
        this.denunciantenaoanonimos = denunciantenaoanonimos;
    }

}