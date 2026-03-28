package com.veltech.portal.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.veltech.portal.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

    boolean existsByEmail(String email);

    boolean existsByRollNumber(String rollNumber);

    Optional<User> findByEmail(String email);

    Optional<User> findByRollNumber(String rollNumber);

}