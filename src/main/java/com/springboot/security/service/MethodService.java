package com.springboot.security.service;

import org.springframework.security.access.annotation.Secured;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Service;

@Service
public class MethodService {
  //@Secured("ROLE_ADMIN")//只有ADMIN角色才可以访问，被继承的ADMIN角色不可访问
  @PreAuthorize("hasRole('ADMIN')")
  public String admin() {
    return "admin";
  }

  //@PreAuthorize("hasRole('ADMIN') and hasRole('DBA')") //同时拥有这几个角色才可以访问
  @PreAuthorize("hasRole('DBA')")
  public String dba() {
    return "dba";
  }

  //@PreAuthorize("hasAnyRole('ADMIN','DBA','USER')")//拥有任何一个角色都可以访问
  @PreAuthorize("hasRole('USER')")
  public String user() {
    return "user";
  }
}
