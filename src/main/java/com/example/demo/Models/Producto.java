package com.example.demo.Models;

import java.math.BigDecimal;
import java.time.Instant;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.data.mongodb.core.mapping.FieldType;

@Document(collection = "productos")
public class Producto {
    @Id
    private String codigo;
    private String product_name;
    private String description;
    private String category;
    private String image_Url;
    private boolean state;
    @Field(targetType = FieldType.DECIMAL128)
    private BigDecimal precio;
    private Instant creadoEn;

    public Producto(String codigo, String product_name, String description, String category, String image_Url, boolean state, BigDecimal precio, Instant creadoEn) {
        this.codigo = codigo;
        this.product_name = product_name;
        this.description = description;
        this.category = category;
        this.image_Url = image_Url;
        this.state = state;
        this.precio = precio;
        this.creadoEn = creadoEn;
    }

    public Producto() {
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return product_name;
    }

    public void setNombre(String product_name) {
        this.product_name = product_name;
    }

    public String getDescripcion() {
        return description;
    }

    public void setDescripcion(String description) {
        this.description = description;
    }

    public String getCategoria() {
        return category;
    }

    public void setCategoria(String category) {
        this.category = category;
    }

    public String getImagenUrl() {
        return image_Url;
    }

    public void setImagenUrl(String image_Url) {
        this.image_Url = image_Url;
    }

    public boolean isActivo() {
        return state;
    }

    public void setActivo(boolean state) {
        this.state = state;
    }

    public BigDecimal getPrecio() {
        return precio;
    }

    public void setPrecio(BigDecimal precio) {
        this.precio = precio;
    }

    public Instant getCreadoEn() {
        return creadoEn;
    }

    public void setCreadoEn(Instant creadoEn) {
        this.creadoEn = creadoEn;
    }
}
