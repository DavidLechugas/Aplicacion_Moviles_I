package com.example.demo.Models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "cuentas")
public class Cuenta {
    @Id
    private String id;
    private String name;
    @JsonIgnore
    private String passwordHash;
    private Rol role;
    private String phone;
    private boolean state;


    public Cuenta(String id, String name, String passwordHash, Rol role, String phone, boolean state) {
        this.id = id;
        this.name = name;
        this.passwordHash = passwordHash;
        this.role = role;
        this.phone = phone;
        this.state = state;
    }

    public Cuenta() {
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return name;
    }

    public void setNombre(String name) {
        this.name = name;
    }

    public String getPasswordHash() {
        return passwordHash;
    }

    public void setPasswordHash(String passwordHash) {
        this.passwordHash = passwordHash;
    }

    public Rol getRol() {
        return role;
    }

    public void setRol(Rol role) {
        this.role = role;
    }

    public String getTelefono() {
        return phone;
    }

    public void setTelefono(String phone) {
        this.phone = phone;
    }

    public boolean isActivo() {
        return state;
    }

    public void setActivo(boolean state) {
        this.state = state;
    }
}
