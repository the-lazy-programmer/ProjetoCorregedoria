package com.example.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import org.hibernate.Hibernate;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class DenunciantenaoanonimoId implements Serializable {
    private static final long serialVersionUID = 3027252777551216830L;
    @Column(name = "cpf", nullable = false, length = 45)
    private String cpf;

    @Column(name = "denuncianteAnonimo", nullable = false)
    private Boolean denuncianteAnonimo = false;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
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
        DenunciantenaoanonimoId entity = (DenunciantenaoanonimoId) o;
        return Objects.equals(this.denuncianteAnonimo, entity.denuncianteAnonimo) &&
                Objects.equals(this.cpf, entity.cpf);
    }

    @Override
    public int hashCode() {
        return Objects.hash(denuncianteAnonimo, cpf);
    }

}