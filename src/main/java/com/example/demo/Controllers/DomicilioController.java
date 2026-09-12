package com.example.demo.Controllers;

import com.example.demo.Models.Domicilio;
import com.example.demo.Services.DomicilioService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class DomicilioController {

    @Autowired
    private DomicilioService domicilioService;

    @PostMapping("/domicilios")
    public Domicilio guardarDomicilio(@RequestBody Domicilio domicilio) {
        return domicilioService.guardarDomicilio(domicilio);
    }

    @GetMapping("/domicilios")
    public List<Domicilio> listarDomicilios() {
        return domicilioService.listarDomicilios();
    }
}

