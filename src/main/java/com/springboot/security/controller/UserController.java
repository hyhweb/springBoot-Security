package com.springboot.security.controller;

import com.springboot.security.service.MethodService;
import com.springboot.security.service.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    RegisterService registerService;

    @Autowired
    MethodService methodService;

    @GetMapping("/admin/hello")
    public String Hello(){
    return "hello admin";
    }
    @GetMapping("/user/hello")
    public String Hello1(){
        return "hello user";
    }

  @PostMapping("/admin/login")
  public String RegisterHandler(String username, String password) {
    String register = registerService.register(username, password);
    return register;
  }

    @GetMapping("/adminHello")
    public String adminHello(){
        return methodService.admin();
    }
    @GetMapping("/dbaHello")
    public String dbaHello(){
        return methodService.dba();
    }
    @GetMapping("/userHello")
    public String userHello(){
        return methodService.user();
    }
}
