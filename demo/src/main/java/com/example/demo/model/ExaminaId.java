package com.example.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import org.hibernate.Hibernate;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class ExaminaId implements Serializable {
    private static final long serialVersionUID = 4841319012570893817L;
    @Column(name = "casoNumero", nullable = false, length = 45)
    private String casoNumero;

    @Column(name = "detenteMatricula", nullable = false, length = 45)
    private String detenteMatricula;

    public String getCasoNumero() {
        return casoNumero;
    }

    public void setCasoNumero(String casoNumero) {
        this.casoNumero = casoNumero;
    }

    public String getDetenteMatricula() {
        return detenteMatricula;
    }

    public void setDetenteMatricula(String detenteMatricula) {
        this.detenteMatricula = detenteMatricula;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        ExaminaId entity = (ExaminaId) o;
        return Objects.equals(this.detenteMatricula, entity.detenteMatricula) &&
                Objects.equals(this.casoNumero, entity.casoNumero);
    }

    @Override
    public int hashCode() {
        return Objects.hash(detenteMatricula, casoNumero);
    }

}