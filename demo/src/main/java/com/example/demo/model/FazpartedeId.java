package com.example.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import org.hibernate.Hibernate;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class FazpartedeId implements Serializable {
    private static final long serialVersionUID = -6102633603397006851L;
    @Column(name = "inqueritoNumero", nullable = false, length = 45)
    private String inqueritoNumero;

    @Column(name = "casoNumero", nullable = false, length = 45)
    private String casoNumero;

    @Column(name = "relatorioNumero", nullable = false, length = 45)
    private String relatorioNumero;

    @Column(name = "documentoNumero", nullable = false, length = 45)
    private String documentoNumero;

    public String getInqueritoNumero() {
        return inqueritoNumero;
    }

    public void setInqueritoNumero(String inqueritoNumero) {
        this.inqueritoNumero = inqueritoNumero;
    }

    public String getCasoNumero() {
        return casoNumero;
    }

    public void setCasoNumero(String casoNumero) {
        this.casoNumero = casoNumero;
    }

    public String getRelatorioNumero() {
        return relatorioNumero;
    }

    public void setRelatorioNumero(String relatorioNumero) {
        this.relatorioNumero = relatorioNumero;
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
        FazpartedeId entity = (FazpartedeId) o;
        return Objects.equals(this.inqueritoNumero, entity.inqueritoNumero) &&
                Objects.equals(this.documentoNumero, entity.documentoNumero) &&
                Objects.equals(this.relatorioNumero, entity.relatorioNumero) &&
                Objects.equals(this.casoNumero, entity.casoNumero);
    }

    @Override
    public int hashCode() {
        return Objects.hash(inqueritoNumero, documentoNumero, relatorioNumero, casoNumero);
    }

}