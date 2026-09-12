package com.example.demo.Services;

import com.example.demo.Models.Venta;
import com.example.demo.Repository.VentaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VentaService {

    @Autowired
    private VentaRepository ventaRepository;

    public Venta guardarVenta(Venta venta) {
        return ventaRepository.save(venta);
    }

    public List<Venta> listarVentas() {
        return ventaRepository.findAll();
    }
}

