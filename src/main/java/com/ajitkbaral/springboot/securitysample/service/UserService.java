package com.ajitkbaral.springboot.securitysample.service;

import com.ajitkbaral.springboot.securitysample.model.CustomUserDetails;
import com.ajitkbaral.springboot.securitysample.model.User;
import com.ajitkbaral.springboot.securitysample.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired private UserRepository userRepository;

    public List<User> getAll() {
        List<User> userList = new ArrayList<>();
        userRepository.findAll().forEach(userList::add);
        return userList;
    }

    public Optional<User> loadUserByPhone(String phone) {
       return userRepository.findByPhone(phone);
    }
}
