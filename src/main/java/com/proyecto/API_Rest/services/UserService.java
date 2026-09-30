package com.proyecto.API_Rest.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyecto.API_Rest.models.UserModel;
import com.proyecto.API_Rest.repositories.UserRepository;

@Service 
public class UserService {
    @Autowired 
    UserRepository userRepository;

    public ArrayList<UserModel> GetUsers(){
        return (ArrayList<UserModel>) userRepository.findAll();
    }

    public UserModel saveUser(UserModel user){
        return userRepository.save(user);
    }
}
