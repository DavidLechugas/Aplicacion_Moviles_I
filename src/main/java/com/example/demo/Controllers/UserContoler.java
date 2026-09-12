package com.example.demo.Controllers;

import com.example.demo.Models.UserModel;
import com.example.demo.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*")

public class UserContoler {

    @Autowired
    private UserRepository userRepository;

    @PostMapping("/usuarios")
    public UserModel guardarVentas(@RequestBody UserModel usuario) {
        return userRepository.guardarPedido(usuario);
    }

}