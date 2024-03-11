package com.sample.repository;

// UserRepository.java
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sample.entity.User;


@Repository
public interface UserRepository extends JpaRepository<User, String> {
    User findByEmail(String email);
}

