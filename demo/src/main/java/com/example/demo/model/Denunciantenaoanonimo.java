package com.example.demo.model;

import jakarta.persistence.*;

@Entity
@Table(name = "denunciantenaoanonimo", schema = "corregedoria", indexes = {
        @Index(name = "denuncianteAnonimo", columnList = "denuncianteAnonimo")
})
public class Denunciantenaoanonimo {
    @EmbeddedId
    private DenunciantenaoanonimoId id;

    @MapsId("denuncianteAnonimo")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "denuncianteAnonimo", nullable = false)
    private Denunciante denuncianteAnonimo;

    @Column(name = "numero", length = 5)
    private String numero;

    @Column(name = "rua", length = 45)
    private String rua;

    @Column(name = "bairro", length = 45)
    private String bairro;

    @Column(name = "cidade", length = 45)
    private String cidade;

    public DenunciantenaoanonimoId getId() {
        return id;
    }

    public void setId(DenunciantenaoanonimoId id) {
        this.id = id;
    }

    public Denunciante getDenuncianteAnonimo() {
        return denuncianteAnonimo;
    }

    public void setDenuncianteAnonimo(Denunciante denuncianteAnonimo) {
        this.denuncianteAnonimo = denuncianteAnonimo;
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

}