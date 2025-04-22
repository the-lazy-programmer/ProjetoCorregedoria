package com.example.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import org.hibernate.Hibernate;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class InvestigaId implements Serializable {
    private static final long serialVersionUID = 5253677802864502935L;
    @Column(name = "investigadorMatricula", nullable = false, length = 45)
    private String investigadorMatricula;

    @Column(name = "delegadoMatricula", nullable = false, length = 45)
    private String delegadoMatricula;

    @Column(name = "inqueritoNumero", nullable = false, length = 45)
    private String inqueritoNumero;

    @Column(name = "casoNumero", nullable = false, length = 45)
    private String casoNumero;

    public String getInvestigadorMatricula() {
        return investigadorMatricula;
    }

    public void setInvestigadorMatricula(String investigadorMatricula) {
        this.investigadorMatricula = investigadorMatricula;
    }

    public String getDelegadoMatricula() {
        return delegadoMatricula;
    }

    public void setDelegadoMatricula(String delegadoMatricula) {
        this.delegadoMatricula = delegadoMatricula;
    }

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        InvestigaId entity = (InvestigaId) o;
        return Objects.equals(this.inqueritoNumero, entity.inqueritoNumero) &&
                Objects.equals(this.investigadorMatricula, entity.investigadorMatricula) &&
                Objects.equals(this.delegadoMatricula, entity.delegadoMatricula) &&
                Objects.equals(this.casoNumero, entity.casoNumero);
    }

    @Override
    public int hashCode() {
        return Objects.hash(inqueritoNumero, investigadorMatricula, delegadoMatricula, casoNumero);
    }

}