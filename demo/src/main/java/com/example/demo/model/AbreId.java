package com.example.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import org.hibernate.Hibernate;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class AbreId implements Serializable {
    private static final long serialVersionUID = -4849134794543557969L;
    @Column(name = "delegadoMatricula", nullable = false, length = 45)
    private String delegadoMatricula;

    @Column(name = "apfNumero", nullable = false, length = 45)
    private String apfNumero;

    @Column(name = "inqueritoNumero", nullable = false, length = 45)
    private String inqueritoNumero;

    public String getDelegadoMatricula() {
        return delegadoMatricula;
    }

    public void setDelegadoMatricula(String delegadoMatricula) {
        this.delegadoMatricula = delegadoMatricula;
    }

    public String getApfNumero() {
        return apfNumero;
    }

    public void setApfNumero(String apfNumero) {
        this.apfNumero = apfNumero;
    }

    public String getInqueritoNumero() {
        return inqueritoNumero;
    }

    public void setInqueritoNumero(String inqueritoNumero) {
        this.inqueritoNumero = inqueritoNumero;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        AbreId entity = (AbreId) o;
        return Objects.equals(this.inqueritoNumero, entity.inqueritoNumero) &&
                Objects.equals(this.apfNumero, entity.apfNumero) &&
                Objects.equals(this.delegadoMatricula, entity.delegadoMatricula);
    }

    @Override
    public int hashCode() {
        return Objects.hash(inqueritoNumero, apfNumero, delegadoMatricula);
    }

}