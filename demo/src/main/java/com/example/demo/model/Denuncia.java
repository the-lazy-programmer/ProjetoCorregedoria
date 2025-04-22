package com.example.demo.model;

import jakarta.persistence.*;

import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "denuncia", schema = "corregedoria", indexes = {
        @Index(name = "detenteMatricula", columnList = "detenteMatricula"),
        @Index(name = "denuncianteAnonimo", columnList = "denuncianteAnonimo")
})
public class Denuncia {
    @EmbeddedId
    private DenunciaId id;

    @MapsId("secretariaMatricula")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "secretariaMatricula", nullable = false)
    private Secretaria secretariaMatricula;

    @MapsId("detenteMatricula")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "detenteMatricula", nullable = false)
    private Detente detenteMatricula;

    @MapsId("denuncianteAnonimo")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "denuncianteAnonimo", nullable = false)
    private Denunciante denuncianteAnonimo;

    @Column(name = "canal", length = 30)
    private String canal;

    @OneToMany(mappedBy = "denuncia")
    private Set<Avalia> avalias = new LinkedHashSet<>();

    public DenunciaId getId() {
        return id;
    }

    public void setId(DenunciaId id) {
        this.id = id;
    }

    public Secretaria getSecretariaMatricula() {
        return secretariaMatricula;
    }

    public void setSecretariaMatricula(Secretaria secretariaMatricula) {
        this.secretariaMatricula = secretariaMatricula;
    }

    public Detente getDetenteMatricula() {
        return detenteMatricula;
    }

    public void setDetenteMatricula(Detente detenteMatricula) {
        this.detenteMatricula = detenteMatricula;
    }

    public Denunciante getDenuncianteAnonimo() {
        return denuncianteAnonimo;
    }

    public void setDenuncianteAnonimo(Denunciante denuncianteAnonimo) {
        this.denuncianteAnonimo = denuncianteAnonimo;
    }

    public String getCanal() {
        return canal;
    }

    public void setCanal(String canal) {
        this.canal = canal;
    }

    public Set<Avalia> getAvalias() {
        return avalias;
    }

    public void setAvalias(Set<Avalia> avalias) {
        this.avalias = avalias;
    }

}