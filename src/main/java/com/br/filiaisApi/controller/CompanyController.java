package com.br.filiaisApi.controller;

import com.br.filiaisApi.domain.entity.CompanyBranch;
import com.br.filiaisApi.dto.request.CompanyBranchRequest;
import com.br.filiaisApi.service.CompanyBranchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/companys")
public class CompanyController {

    @Autowired
    private CompanyBranchService service;

    @PostMapping
    public ResponseEntity<CompanyBranch> createdCompany(@RequestBody CompanyBranchRequest request) {
        return service.saveCompany(request);
    }

}
