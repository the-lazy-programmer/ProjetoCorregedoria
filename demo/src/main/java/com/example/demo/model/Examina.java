package com.example.demo.model;

import jakarta.persistence.*;

@Entity
@Table(name = "examina", schema = "corregedoria", indexes = {
        @Index(name = "detenteMatricula", columnList = "detenteMatricula")
})
public class Examina {
    @EmbeddedId
    private ExaminaId id;

    @MapsId("casoNumero")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "casoNumero", nullable = false)
    private Caso casoNumero;

    @MapsId("detenteMatricula")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "detenteMatricula", nullable = false)
    private Detente detenteMatricula;

    public ExaminaId getId() {
        return id;
    }

    public void setId(ExaminaId id) {
        this.id = id;
    }

    public Caso getCasoNumero() {
        return casoNumero;
    }

    public void setCasoNumero(Caso casoNumero) {
        this.casoNumero = casoNumero;
    }

    public Detente getDetenteMatricula() {
        return detenteMatricula;
    }

    public void setDetenteMatricula(Detente detenteMatricula) {
        this.detenteMatricula = detenteMatricula;
    }

}