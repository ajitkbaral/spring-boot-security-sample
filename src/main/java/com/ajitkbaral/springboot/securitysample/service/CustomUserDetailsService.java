package com.ajitkbaral.springboot.securitysample.service;

import com.ajitkbaral.springboot.securitysample.model.CustomUserDetails;
import com.ajitkbaral.springboot.securitysample.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CustomUserDetailsService implements UserDetailsService {

    @Autowired
    private UserService userService;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<User> optionalUser = userService.loadUserByPhone(username);
                optionalUser.orElseThrow(() -> new UsernameNotFoundException("Phone number not found"));
        return optionalUser.map(CustomUserDetails::new).get();
    }
}
