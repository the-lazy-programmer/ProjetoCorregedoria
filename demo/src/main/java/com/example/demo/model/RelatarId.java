package com.example.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import org.hibernate.Hibernate;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class RelatarId implements Serializable {
    private static final long serialVersionUID = 7134153137502967263L;
    @Column(name = "relatorioNumero", nullable = false, length = 45)
    private String relatorioNumero;

    @Column(name = "escrivaoMatricula", nullable = false, length = 45)
    private String escrivaoMatricula;

    @Column(name = "investigadorMatricula", nullable = false, length = 45)
    private String investigadorMatricula;

    public String getRelatorioNumero() {
        return relatorioNumero;
    }

    public void setRelatorioNumero(String relatorioNumero) {
        this.relatorioNumero = relatorioNumero;
    }

    public String getEscrivaoMatricula() {
        return escrivaoMatricula;
    }

    public void setEscrivaoMatricula(String escrivaoMatricula) {
        this.escrivaoMatricula = escrivaoMatricula;
    }

    public String getInvestigadorMatricula() {
        return investigadorMatricula;
    }

    public void setInvestigadorMatricula(String investigadorMatricula) {
        this.investigadorMatricula = investigadorMatricula;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        RelatarId entity = (RelatarId) o;
        return Objects.equals(this.investigadorMatricula, entity.investigadorMatricula) &&
                Objects.equals(this.escrivaoMatricula, entity.escrivaoMatricula) &&
                Objects.equals(this.relatorioNumero, entity.relatorioNumero);
    }

    @Override
    public int hashCode() {
        return Objects.hash(investigadorMatricula, escrivaoMatricula, relatorioNumero);
    }

}