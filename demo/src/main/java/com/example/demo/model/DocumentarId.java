package com.example.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import org.hibernate.Hibernate;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class DocumentarId implements Serializable {
    private static final long serialVersionUID = -5361981419200454149L;
    @Column(name = "escrivaoMatricula", nullable = false, length = 45)
    private String escrivaoMatricula;

    @Column(name = "documentoNumero", nullable = false, length = 45)
    private String documentoNumero;

    public String getEscrivaoMatricula() {
        return escrivaoMatricula;
    }

    public void setEscrivaoMatricula(String escrivaoMatricula) {
        this.escrivaoMatricula = escrivaoMatricula;
    }

    public String getDocumentoNumero() {
        return documentoNumero;
    }

    public void setDocumentoNumero(String documentoNumero) {
        this.documentoNumero = documentoNumero;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        DocumentarId entity = (DocumentarId) o;
        return Objects.equals(this.escrivaoMatricula, entity.escrivaoMatricula) &&
                Objects.equals(this.documentoNumero, entity.documentoNumero);
    }

    @Override
    public int hashCode() {
        return Objects.hash(escrivaoMatricula, documentoNumero);
    }

}