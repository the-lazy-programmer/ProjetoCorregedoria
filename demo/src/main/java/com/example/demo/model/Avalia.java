package com.example.demo.model;

import jakarta.persistence.*;

@Entity
@Table(name = "avalia", schema = "corregedoria", indexes = {
        @Index(name = "denunciaSecretariaMatricula", columnList = "denunciaSecretariaMatricula, denunciaDetenteMatricula, denunciaDenuncianteAnonimo")
})
public class Avalia {
    @EmbeddedId
    private AvaliaId id;

    @MapsId("delegadoMatricula")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "delegadoMatricula", nullable = false)
    private Delegado delegadoMatricula;

    @MapsId("id")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumns({
            @JoinColumn(name = "denunciaSecretariaMatricula", referencedColumnName = "secretariaMatricula", nullable = false),
            @JoinColumn(name = "denunciaDetenteMatricula", referencedColumnName = "detenteMatricula", nullable = false),
            @JoinColumn(name = "denunciaDenuncianteAnonimo", referencedColumnName = "denuncianteAnonimo", nullable = false)
    })
    private Denuncia denuncia;

    @Column(name = "aprovada")
    private Boolean aprovada;

    public AvaliaId getId() {
        return id;
    }

    public void setId(AvaliaId id) {
        this.id = id;
    }

    public Delegado getDelegadoMatricula() {
        return delegadoMatricula;
    }

    public void setDelegadoMatricula(Delegado delegadoMatricula) {
        this.delegadoMatricula = delegadoMatricula;
    }

    public Denuncia getDenuncia() {
        return denuncia;
    }

    public void setDenuncia(Denuncia denuncia) {
        this.denuncia = denuncia;
    }

    public Boolean getAprovada() {
        return aprovada;
    }

    public void setAprovada(Boolean aprovada) {
        this.aprovada = aprovada;
    }

}