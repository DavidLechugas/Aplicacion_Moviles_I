package com.example.demo.Controllers;

import com.example.demo.Models.Venta;
import com.example.demo.Services.VentaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class VentaController {

    @Autowired
    private VentaService ventaService;

    @PostMapping("/ventas")
    public Venta guardarVenta(@RequestBody Venta venta) {
        return ventaService.guardarVenta(venta);
    }

    @GetMapping("/ventas")
    public List<Venta> listarVentas() {
        return ventaService.listarVentas();
    }
}

