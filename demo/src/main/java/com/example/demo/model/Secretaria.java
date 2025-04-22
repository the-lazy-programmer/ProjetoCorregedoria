package com.example.demo.model;

import jakarta.persistence.*;

import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "secretaria", schema = "corregedoria")
public class Secretaria {
    @Id
    @Column(name = "funcionarioMatricula", nullable = false, length = 45)
    private String funcionarioMatricula;

    @MapsId
    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "funcionarioMatricula", nullable = false)
    private Funcionario funcionario;

    @OneToMany(mappedBy = "secretariaMatricula")
    private Set<Denuncia> denuncias = new LinkedHashSet<>();

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

    public Set<Denuncia> getDenuncias() {
        return denuncias;
    }

    public void setDenuncias(Set<Denuncia> denuncias) {
        this.denuncias = denuncias;
    }

}