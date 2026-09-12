package com.example.demo.Repository;

import com.example.demo.Models.Cuenta;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CuentaRepository extends MongoRepository<Cuenta, String> {
}

