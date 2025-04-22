package com.example.demo.model;

import jakarta.persistence.*;

@Entity
@Table(name = "investigativo", schema = "corregedoria")
public class Investigativo {
    @Id
    @Column(name = "funcionarioMatricula", nullable = false, length = 45)
    private String funcionarioMatricula;

    @MapsId
    @OneToOne
    @JoinColumn(name = "funcionarioMatricula")
    private Funcionario funcionario;

    @OneToOne(mappedBy = "investigativo")
    private Delegado delegado;

    @OneToOne(mappedBy = "investigativo")
    private Escrivao escrivao;

    @OneToOne(mappedBy = "investigativo")
    private Investigador investigador;

    public String getFuncionarioMatricula() {
        return funcionarioMatricula;
    }

    public void setFuncionarioMatricula(String funcionarioMatricula) {
        this.funcionarioMatricula = funcionarioMatricula;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public Delegado getDelegado() {
        return delegado;
    }

    public void setDelegado(Delegado delegado) {
        this.delegado = delegado;
    }

    public Escrivao getEscrivao() {
        return escrivao;
    }

    public void setEscrivao(Escrivao escrivao) {
        this.escrivao = escrivao;
    }

    public Investigador getInvestigador() {
        return investigador;
    }

    public void setInvestigador(Investigador investigador) {
        this.investigador = investigador;
    }

}