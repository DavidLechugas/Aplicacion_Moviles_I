package com.example.demo.Services;

import com.example.demo.Models.Cuenta;
import com.example.demo.Repository.CuentaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CuentaService {

    @Autowired
    private CuentaRepository cuentaRepository;

    public Cuenta guardarCuenta(Cuenta cuenta) {
        return cuentaRepository.save(cuenta);
    }

    public List<Cuenta> listarCuentas() {
        return cuentaRepository.findAll();
    }
}

