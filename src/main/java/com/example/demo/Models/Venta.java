package com.example.demo.Models;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.List;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.data.mongodb.core.mapping.FieldType;

@Document(collection = "ventas")
public class Venta {
    @Id
    private String id;
    private String claveOperacion;
    private String administradorId;
    private CanalVenta canal;
    private EstadoVenta estado;
    private MetodoPago metodoPago;
    private List<DetalleVenta> detalles;
    @Field(targetType = FieldType.DECIMAL128)
    private BigDecimal subtotal;
    @Field(targetType = FieldType.DECIMAL128)
    private BigDecimal costoDomicilio;
    @Field(targetType = FieldType.DECIMAL128)
    private BigDecimal total;
    private Instant creadoEn;
    private Instant pagadoEn;


    public Venta(String id, String claveOperacion, String administradorId, CanalVenta canal, EstadoVenta estado, MetodoPago metodoPago, List<DetalleVenta> detalles, BigDecimal subtotal, BigDecimal costoDomicilio, BigDecimal total, Instant creadoEn, Instant pagadoEn) {
        this.id = id;
        this.claveOperacion = claveOperacion;
        this.administradorId = administradorId;
        this.canal = canal;
        this.estado = estado;
        this.metodoPago = metodoPago;
        this.detalles = detalles;
        this.subtotal = subtotal;
        this.costoDomicilio = costoDomicilio;
        this.total = total;
        this.creadoEn = creadoEn;
        this.pagadoEn = pagadoEn;
    }

    public Venta() {
    }

    public String getId() {
        return id;
    }

    public String getClaveOperacion() {
        return claveOperacion;
    }

    public void setClaveOperacion(String claveOperacion) {
        this.claveOperacion = claveOperacion;
    }

    public String getAdministradorId() {
        return administradorId;
    }

    public void setAdministradorId(String administradorId) {
        this.administradorId = administradorId;
    }

    public CanalVenta getCanal() {
        return canal;
    }

    public void setCanal(CanalVenta canal) {
        this.canal = canal;
    }

    public EstadoVenta getEstado() {
        return estado;
    }

    public void setEstado(EstadoVenta estado) {
        this.estado = estado;
    }

    public MetodoPago getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(MetodoPago metodoPago) {
        this.metodoPago = metodoPago;
    }

    public List<DetalleVenta> getDetalles() {
        return detalles;
    }

    public void setDetalles(List<DetalleVenta> detalles) {
        this.detalles = detalles;
    }

    public BigDecimal getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(BigDecimal subtotal) {
        this.subtotal = subtotal;
    }

    public BigDecimal getCostoDomicilio() {
        return costoDomicilio;
    }

    public void setCostoDomicilio(BigDecimal costoDomicilio) {
        this.costoDomicilio = costoDomicilio;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public Instant getCreadoEn() {
        return creadoEn;
    }

    public void setCreadoEn(Instant creadoEn) {
        this.creadoEn = creadoEn;
    }

    public Instant getPagadoEn() {
        return pagadoEn;
    }

    public void setPagadoEn(Instant pagadoEn) {
        this.pagadoEn = pagadoEn;
    }
}
