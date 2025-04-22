package com.example.demo.model;

import jakarta.persistence.*;

import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "corregedoria", schema = "corregedoria")
public class Corregedoria {
    @Id
    @Column(name = "cnpj", nullable = false, length = 45)
    private String cnpj;

    @Column(name = "numero", length = 5)
    private String numero;

    @Column(name = "rua", length = 45)
    private String rua;

    @Column(name = "bairro", length = 45)
    private String bairro;

    @Column(name = "cidade", length = 45)
    private String cidade;

    @ManyToMany
    @JoinTable(name = "emprega",
            joinColumns = @JoinColumn(name = "corregedoriaCnpj"),
            inverseJoinColumns = @JoinColumn(name = "funcionarioMatricula"))
    private Set<Funcionario> funcionarios = new LinkedHashSet<>();

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public Set<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(Set<Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }

}