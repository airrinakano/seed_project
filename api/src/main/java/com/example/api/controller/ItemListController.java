package com.example.spring_project.controller;

import com.example.spring_project.consts.UrlConsts;
import com.example.spring_project.service.ItemListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ItemListController {

    @Autowired
    ItemListService itemListService;

    @GetMapping(value = UrlConsts.ITEM_LIST)
    public ResponseEntity<List<String>> getCompanyList() {

        return new ResponseEntity<>(HttpStatus.OK);
    }

}
