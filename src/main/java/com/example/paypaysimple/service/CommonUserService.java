package com.example.paypaysimple.service;

import com.example.paypaysimple.model.CommonUser;
import com.example.paypaysimple.repository.CommonUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommonUserService {
    @Autowired
    private CommonUserRepository userRepository;

    public CommonUser findByEmail(String email) {
        return userRepository.findByEmail(email).orElse(null);
    }
}
