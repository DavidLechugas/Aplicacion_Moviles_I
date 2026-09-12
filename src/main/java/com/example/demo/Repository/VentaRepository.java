package com.example.demo.Repository;

import com.example.demo.Models.Venta;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface VentaRepository extends MongoRepository<Venta, String> {
}

