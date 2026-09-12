package com.example.demo.Controllers;

import com.example.demo.Models.Producto;
import com.example.demo.Services.ProductoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ProductoController {

    @Autowired
    private ProductoService productoService;

    @PostMapping("/productos")
    public Producto guardarProducto(@RequestBody Producto producto) {
        return productoService.guardarProducto(producto);
    }

    @GetMapping("/productos")
    public List<Producto> listarProductos() {
        return productoService.listarProductos();
    }
}

