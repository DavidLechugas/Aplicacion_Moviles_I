package com.example.demo.Models;

import java.sql.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "usuarios")
public class UserModel {

    @Id
    public int id;
    public String[] producto;
    public int cantidad;
    public String imagen;
    public Date fecha;

    public UserModel(int id, String[] producto, int cantidad, String imagen, Date fecha) {
        this.id = id;
        this.producto = producto;
        this.cantidad = cantidad;
        this.imagen = imagen;
        this.fecha = fecha;
    }

    public UserModel(){

    }

}