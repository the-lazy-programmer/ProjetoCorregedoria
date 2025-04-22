package com.example.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import org.hibernate.Hibernate;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class AvaliaId implements Serializable {
    private static final long serialVersionUID = 241486150759408225L;
    @Column(name = "delegadoMatricula", nullable = false, length = 45)
    private String delegadoMatricula;

    @Column(name = "denunciaSecretariaMatricula", nullable = false, length = 45)
    private String denunciaSecretariaMatricula;

    @Column(name = "denunciaDetenteMatricula", nullable = false, length = 45)
    private String denunciaDetenteMatricula;

    @Column(name = "denunciaDenuncianteAnonimo", nullable = false)
    private Boolean denunciaDenuncianteAnonimo = false;

    public String getDelegadoMatricula() {
        return delegadoMatricula;
    }

    public void setDelegadoMatricula(String delegadoMatricula) {
        this.delegadoMatricula = delegadoMatricula;
    }

    public String getDenunciaSecretariaMatricula() {
        return denunciaSecretariaMatricula;
    }

    public void setDenunciaSecretariaMatricula(String denunciaSecretariaMatricula) {
        this.denunciaSecretariaMatricula = denunciaSecretariaMatricula;
    }

    public String getDenunciaDetenteMatricula() {
        return denunciaDetenteMatricula;
    }

    public void setDenunciaDetenteMatricula(String denunciaDetenteMatricula) {
        this.denunciaDetenteMatricula = denunciaDetenteMatricula;
    }

    public Boolean getDenunciaDenuncianteAnonimo() {
        return denunciaDenuncianteAnonimo;
    }

    public void setDenunciaDenuncianteAnonimo(Boolean denunciaDenuncianteAnonimo) {
        this.denunciaDenuncianteAnonimo = denunciaDenuncianteAnonimo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        AvaliaId entity = (AvaliaId) o;
        return Objects.equals(this.denunciaDetenteMatricula, entity.denunciaDetenteMatricula) &&
                Objects.equals(this.denunciaSecretariaMatricula, entity.denunciaSecretariaMatricula) &&
                Objects.equals(this.denunciaDenuncianteAnonimo, entity.denunciaDenuncianteAnonimo) &&
                Objects.equals(this.delegadoMatricula, entity.delegadoMatricula);
    }

    @Override
    public int hashCode() {
        return Objects.hash(denunciaDetenteMatricula, denunciaSecretariaMatricula, denunciaDenuncianteAnonimo, delegadoMatricula);
    }

}