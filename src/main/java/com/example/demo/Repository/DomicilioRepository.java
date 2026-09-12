package com.example.demo.Repository;

import com.example.demo.Models.Domicilio;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface DomicilioRepository extends MongoRepository<Domicilio, String> {
}

