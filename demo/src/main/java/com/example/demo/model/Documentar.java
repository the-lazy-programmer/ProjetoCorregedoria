package com.example.demo.model;

import jakarta.persistence.*;

@Entity
@Table(name = "documentar", schema = "corregedoria", indexes = {
        @Index(name = "documentoNumero", columnList = "documentoNumero")
})
public class Documentar {
    @EmbeddedId
    private DocumentarId id;

    @MapsId("escrivaoMatricula")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "escrivaoMatricula", nullable = false)
    private Escrivao escrivaoMatricula;

    @MapsId("documentoNumero")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "documentoNumero", nullable = false)
    private Documento documentoNumero;

    public DocumentarId getId() {
        return id;
    }

    public void setId(DocumentarId id) {
        this.id = id;
    }

    public Escrivao getEscrivaoMatricula() {
        return escrivaoMatricula;
    }

    public void setEscrivaoMatricula(Escrivao escrivaoMatricula) {
        this.escrivaoMatricula = escrivaoMatricula;
    }

    public Documento getDocumentoNumero() {
        return documentoNumero;
    }

    public void setDocumentoNumero(Documento documentoNumero) {
        this.documentoNumero = documentoNumero;
    }

}