package com.example.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import org.hibernate.Hibernate;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class OrdemdeprisaoId implements Serializable {
    private static final long serialVersionUID = -5514122837902952729L;
    @Column(name = "apfNumero", nullable = false, length = 45)
    private String apfNumero;

    @Column(name = "casoNumero", nullable = false, length = 45)
    private String casoNumero;

    @Column(name = "detenteMatricula", nullable = false, length = 45)
    private String detenteMatricula;

    public String getApfNumero() {
        return apfNumero;
    }

    public void setApfNumero(String apfNumero) {
        this.apfNumero = apfNumero;
    }

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
        OrdemdeprisaoId entity = (OrdemdeprisaoId) o;
        return Objects.equals(this.detenteMatricula, entity.detenteMatricula) &&
                Objects.equals(this.apfNumero, entity.apfNumero) &&
                Objects.equals(this.casoNumero, entity.casoNumero);
    }

    @Override
    public int hashCode() {
        return Objects.hash(detenteMatricula, apfNumero, casoNumero);
    }

}