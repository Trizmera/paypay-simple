package com.example.paypaysimple.repository;

import com.example.paypaysimple.model.CommonUser;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CommonUserRepository extends JpaRepository<CommonUser, Long> {
    Optional<CommonUser> findByEmail(String email);
}
