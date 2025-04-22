package com.example.demo.model;

import jakarta.persistence.*;

@Entity
@Table(name = "emprega", schema = "corregedoria", indexes = {
        @Index(name = "corregedoriaCnpj", columnList = "corregedoriaCnpj")
})
public class Emprega {
    @EmbeddedId
    private EmpregaId id;

    @MapsId("funcionarioMatricula")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "funcionarioMatricula", nullable = false)
    private Funcionario funcionarioMatricula;

    @MapsId("corregedoriaCnpj")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "corregedoriaCnpj", nullable = false)
    private Corregedoria corregedoriaCnpj;

    public EmpregaId getId() {
        return id;
    }

    public void setId(EmpregaId id) {
        this.id = id;
    }

    public Funcionario getFuncionarioMatricula() {
        return funcionarioMatricula;
    }

    public void setFuncionarioMatricula(Funcionario funcionarioMatricula) {
        this.funcionarioMatricula = funcionarioMatricula;
    }

    public Corregedoria getCorregedoriaCnpj() {
        return corregedoriaCnpj;
    }

    public void setCorregedoriaCnpj(Corregedoria corregedoriaCnpj) {
        this.corregedoriaCnpj = corregedoriaCnpj;
    }

}