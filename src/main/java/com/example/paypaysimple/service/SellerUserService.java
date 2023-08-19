package com.example.paypaysimple.service;

import com.example.paypaysimple.model.SellerUser;
import com.example.paypaysimple.repository.SellerUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SellerUserService {
    @Autowired
    private SellerUserRepository userRepository;

    public SellerUser findByEmail(String email) {
        return userRepository.findByEmail(email).orElse(null);
    }
}
