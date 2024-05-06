package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.domain.login;
import com.example.demo.repository.loginrepo;

@Service
public class logservice {
    @Autowired
    private loginrepo repo;

    public login log(String username, String password) {
        login user = repo.findByUsernameAndPassword(username, password);
        return user;
    }
}
