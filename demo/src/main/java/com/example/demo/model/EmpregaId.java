package com.example.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import org.hibernate.Hibernate;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class EmpregaId implements Serializable {
    private static final long serialVersionUID = 3704804357096174526L;
    @Column(name = "funcionarioMatricula", nullable = false, length = 45)
    private String funcionarioMatricula;

    @Column(name = "corregedoriaCnpj", nullable = false, length = 45)
    private String corregedoriaCnpj;

    public String getFuncionarioMatricula() {
        return funcionarioMatricula;
    }

    public void setFuncionarioMatricula(String funcionarioMatricula) {
        this.funcionarioMatricula = funcionarioMatricula;
    }

    public String getCorregedoriaCnpj() {
        return corregedoriaCnpj;
    }

    public void setCorregedoriaCnpj(String corregedoriaCnpj) {
        this.corregedoriaCnpj = corregedoriaCnpj;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        EmpregaId entity = (EmpregaId) o;
        return Objects.equals(this.corregedoriaCnpj, entity.corregedoriaCnpj) &&
                Objects.equals(this.funcionarioMatricula, entity.funcionarioMatricula);
    }

    @Override
    public int hashCode() {
        return Objects.hash(corregedoriaCnpj, funcionarioMatricula);
    }

}