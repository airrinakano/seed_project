package com.example.api.controller;

import com.example.api.service.ItemListService;
import com.example.api.service.LoginService;
import com.example.spring_project.consts.UrlConsts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.web.csrf.DefaultCsrfToken;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
public class LoginController {

    @Autowired
    LoginService loginService;

    @GetMapping(value = "/api/prelogin")
    public String login(HttpServletRequest request) {
        DefaultCsrfToken token = (DefaultCsrfToken) request.getAttribute("_csrf");
        if (token == null) {
            throw new RuntimeException("could not get a token.");
        }
        return token.getToken();
    }

//    @PostMapping(value = "/api/login")
//    public String getCompanyList(HttpServletRequest request @ResponseBody UserForm userForm) {
//        DefaultCsrfToken token = (DefaultCsrfToken) request.getAttribute("_csrf");
//        if (token == null) {
//            throw new RuntimeException("could not get a token.");
//        }
//        return token.getToken();
////        return new ResponseEntity<>(HttpStatus.OK);
//    }

}
