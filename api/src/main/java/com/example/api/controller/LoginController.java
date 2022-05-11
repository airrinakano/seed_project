package com.example.api.controller;

import com.example.api.service.ItemListService;
import com.example.api.service.LoginService;
import com.example.spring_project.consts.UrlConsts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class LoginController {

    @Autowired
    LoginService loginService;

    @RequestMapping(path = "/api/login", method = RequestMethod.POST)
    public ResponseEntity<List<String>> getCompanyList() {

        return new ResponseEntity<>(HttpStatus.OK);
    }

}
