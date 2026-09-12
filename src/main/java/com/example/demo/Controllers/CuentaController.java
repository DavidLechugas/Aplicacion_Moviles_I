package com.example.demo.Controllers;

import com.example.demo.Models.Cuenta;
import com.example.demo.Services.CuentaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class CuentaController {

    @Autowired
    private CuentaService cuentaService;

    @PostMapping("/cuentas")
    public Cuenta guardarCuenta(@RequestBody Cuenta cuenta) {
        return cuentaService.guardarCuenta(cuenta);
    }

    @GetMapping("/cuentas")
    public List<Cuenta> listarCuentas() {
        return cuentaService.listarCuentas();
    }
}

