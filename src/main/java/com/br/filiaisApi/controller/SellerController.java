package com.br.filiaisApi.controller;

import com.br.filiaisApi.dto.request.SellerRequest;
import com.br.filiaisApi.entity.Sellers;
import com.br.filiaisApi.service.SellerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sellers")
public class SellerController {

    @Autowired
    private SellerService service;

    @PostMapping
    public ResponseEntity<Sellers> createdSellers(@RequestBody SellerRequest sellers){
        return service.saveSellers(sellers);
    }
}
