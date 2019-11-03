package com.springboot.security.service;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class RegisterService {
  public String register(String username, String password) {
    BCryptPasswordEncoder cryptPasswordEncoder = new BCryptPasswordEncoder(10);
    String encodePassword = cryptPasswordEncoder.encode(password);
    return encodePassword;
  }
}
