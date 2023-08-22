package com.example.paypaysimple.controller;

import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.paypaysimple.model.CommonUser;
import com.example.paypaysimple.model.SellerUser;
import com.example.paypaysimple.service.CommonUserService;
import com.example.paypaysimple.service.SellerUserService;

@RestController
@RequestMapping
public class UserController {
    @Autowired
    private CommonUserService commonUserService;

    @Autowired
    private SellerUserService sellerUserService;

    @PostMapping("/register/common")
    public ResponseEntity<String> registerCommonUser(@RequestBody CommonUser commonUser) {
        // Perform validation and registration logic
        // Save the user using commonUserService
        return ResponseEntity.ok("Common user registered successfully.");
    }

    @PostMapping("/register/seller")
    public ResponseEntity<String> registerSellerUser(@RequestBody SellerUser sellerUser) {
        // Perform validation and registration logic
        // Save the user using sellerUserService
        return ResponseEntity.ok("Seller user registered successfully.");
    }

    // Add more controller methods for login, profile access, etc.
}
}
