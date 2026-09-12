package com.example.demo.Repository;

import com.example.demo.Models.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserRepository {

    @Autowired
    userRepo userRepo;
    
    public UserModel guardarPedido(UserModel user){
        return userRepo.save(user);
    }

    
}
