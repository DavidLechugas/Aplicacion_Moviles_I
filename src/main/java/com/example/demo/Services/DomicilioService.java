package com.example.demo.Services;

import com.example.demo.Models.Domicilio;
import com.example.demo.Repository.DomicilioRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DomicilioService {

    @Autowired
    private DomicilioRepository domicilioRepository;

    public Domicilio guardarDomicilio(Domicilio domicilio) {
        return domicilioRepository.save(domicilio);
    }

    public List<Domicilio> listarDomicilios() {
        return domicilioRepository.findAll();
    }
}

