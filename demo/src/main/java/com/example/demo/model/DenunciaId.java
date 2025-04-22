package com.example.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import org.hibernate.Hibernate;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class DenunciaId implements Serializable {
    private static final long serialVersionUID = -5971714410850994115L;
    @Column(name = "secretariaMatricula", nullable = false, length = 45)
    private String secretariaMatricula;

    @Column(name = "detenteMatricula", nullable = false, length = 45)
    private String detenteMatricula;

    @Column(name = "denuncianteAnonimo", nullable = false)
    private Boolean denuncianteAnonimo = false;

    public String getSecretariaMatricula() {
        return secretariaMatricula;
    }

    public void setSecretariaMatricula(String secretariaMatricula) {
        this.secretariaMatricula = secretariaMatricula;
    }

    public String getDetenteMatricula() {
        return detenteMatricula;
    }

    public void setDetenteMatricula(String detenteMatricula) {
        this.detenteMatricula = detenteMatricula;
    }

    public Boolean getDenuncianteAnonimo() {
        return denuncianteAnonimo;
    }

    public void setDenuncianteAnonimo(Boolean denuncianteAnonimo) {
        this.denuncianteAnonimo = denuncianteAnonimo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        DenunciaId entity = (DenunciaId) o;
        return Objects.equals(this.denuncianteAnonimo, entity.denuncianteAnonimo) &&
                Objects.equals(this.detenteMatricula, entity.detenteMatricula) &&
                Objects.equals(this.secretariaMatricula, entity.secretariaMatricula);
    }

    @Override
    public int hashCode() {
        return Objects.hash(denuncianteAnonimo, detenteMatricula, secretariaMatricula);
    }

}