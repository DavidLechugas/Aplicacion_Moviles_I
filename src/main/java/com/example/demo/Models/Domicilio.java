package com.example.demo.Models;

import java.time.Instant;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "domicilios")
public class Domicilio {
    @Id
    private String id;
    private String ventaId;
    private String domiciliarioId;
    private Destinatario destinatario;
    private EstadoDomicilio estado;
    private Instant creadoEn;
    private Instant asignadoEn;
    private Instant entregadoEn;


    public Domicilio(String id, String ventaId, String domiciliarioId, Destinatario destinatario, EstadoDomicilio estado, Instant creadoEn, Instant asignadoEn, Instant entregadoEn) {
        this.id = id;
        this.ventaId = ventaId;
        this.domiciliarioId = domiciliarioId;
        this.destinatario = destinatario;
        this.estado = estado;
        this.creadoEn = creadoEn;
        this.asignadoEn = asignadoEn;
        this.entregadoEn = entregadoEn;
    }

    public Domicilio() {
    }

    public String getId() {
        return id;
    }

    public String getVentaId() {
        return ventaId;
    }

    public void setVentaId(String ventaId) {
        this.ventaId = ventaId;
    }

    public String getDomiciliarioId() {
        return domiciliarioId;
    }

    public void setDomiciliarioId(String domiciliarioId) {
        this.domiciliarioId = domiciliarioId;
    }

    public Destinatario getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(Destinatario destinatario) {
        this.destinatario = destinatario;
    }

    public EstadoDomicilio getEstado() {
        return estado;
    }

    public void setEstado(EstadoDomicilio estado) {
        this.estado = estado;
    }

    public Instant getCreadoEn() {
        return creadoEn;
    }

    public void setCreadoEn(Instant creadoEn) {
        this.creadoEn = creadoEn;
    }

    public Instant getAsignadoEn() {
        return asignadoEn;
    }

    public void setAsignadoEn(Instant asignadoEn) {
        this.asignadoEn = asignadoEn;
    }

    public Instant getEntregadoEn() {
        return entregadoEn;
    }

    public void setEntregadoEn(Instant entregadoEn) {
        this.entregadoEn = entregadoEn;
    }
}
