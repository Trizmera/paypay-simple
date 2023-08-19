package com.example.paypaysimple.repository;

import com.example.paypaysimple.model.SellerUser;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface SellerUserRepository extends JpaRepository<SellerUser, Long> {
    Optional<SellerUser> findByEmail(String email);
}
