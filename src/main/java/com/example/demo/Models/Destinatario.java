package com.example.demo.Models;

public class Destinatario {
    private String nombre;
    private String telefono;
    private String direccion;
    private String indicaciones;

    public Destinatario(String nombre, String telefono, String direccion, String indicaciones) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
        this.indicaciones = indicaciones;
    }

    public Destinatario() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getIndicaciones() {
        return indicaciones;
    }

    public void setIndicaciones(String indicaciones) {
        this.indicaciones = indicaciones;
    }
}
