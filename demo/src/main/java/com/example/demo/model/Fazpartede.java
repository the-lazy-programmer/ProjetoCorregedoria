package com.example.demo.model;

import jakarta.persistence.*;

@Entity
@Table(name = "fazpartede", schema = "corregedoria", indexes = {
        @Index(name = "casoNumero", columnList = "casoNumero"),
        @Index(name = "relatorioNumero", columnList = "relatorioNumero"),
        @Index(name = "documentoNumero", columnList = "documentoNumero")
})
public class Fazpartede {
    @EmbeddedId
    private FazpartedeId id;

    @MapsId("inqueritoNumero")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "inqueritoNumero", nullable = false)
    private Inquerito inqueritoNumero;

    @MapsId("casoNumero")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "casoNumero", nullable = false)
    private Caso casoNumero;

    @MapsId("relatorioNumero")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "relatorioNumero", nullable = false)
    private Relatorio relatorioNumero;

    @MapsId("documentoNumero")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "documentoNumero", nullable = false)
    private Documento documentoNumero;

    public FazpartedeId getId() {
        return id;
    }

    public void setId(FazpartedeId id) {
        this.id = id;
    }

    public Inquerito getInqueritoNumero() {
        return inqueritoNumero;
    }

    public void setInqueritoNumero(Inquerito inqueritoNumero) {
        this.inqueritoNumero = inqueritoNumero;
    }

    public Caso getCasoNumero() {
        return casoNumero;
    }

    public void setCasoNumero(Caso casoNumero) {
        this.casoNumero = casoNumero;
    }

    public Relatorio getRelatorioNumero() {
        return relatorioNumero;
    }

    public void setRelatorioNumero(Relatorio relatorioNumero) {
        this.relatorioNumero = relatorioNumero;
    }

    public Documento getDocumentoNumero() {
        return documentoNumero;
    }

    public void setDocumentoNumero(Documento documentoNumero) {
        this.documentoNumero = documentoNumero;
    }

}