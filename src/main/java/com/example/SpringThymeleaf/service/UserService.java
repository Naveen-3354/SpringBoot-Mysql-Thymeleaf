package com.example.SpringThymeleaf.service;

import com.example.SpringThymeleaf.dao.UserRepository;
import com.example.SpringThymeleaf.model.UserDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public void save(UserDetails user) {
        userRepository.save(user);
    }
}
