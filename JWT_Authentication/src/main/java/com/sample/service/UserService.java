package com.sample.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sample.entity.User;
import com.sample.repository.UserRepository;


@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;


    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public User addUser(User user) {
        return userRepository.save(user);
    }

    public void deleteUser(String email) {
        userRepository.deleteById(email);
    }

    public User updateUser(String email, User newUserDetails) {
        User user = userRepository.findByEmail(email);
        user.setDob(newUserDetails.getDob());
        return userRepository.save(user);
    }

    public User getUserByEmail(String email) {
        return userRepository.findById(email).orElse(null);
    }
}
