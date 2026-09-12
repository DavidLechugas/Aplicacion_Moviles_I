package com.example.demo.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.example.demo.Models.UserModel;

public interface userRepo extends MongoRepository<UserModel, Integer> {

    

}
