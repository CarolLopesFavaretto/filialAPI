package com.br.filiaisApi.service;

import com.br.filiaisApi.repository.CompanyBranchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CompanyBranchService {

    @Autowired
    private CompanyBranchRepository repository;

}
