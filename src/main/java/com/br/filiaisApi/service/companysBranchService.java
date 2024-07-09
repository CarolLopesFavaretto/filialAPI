package com.br.filiaisApi.service;

import com.br.filiaisApi.repository.companysBranchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class companysBranchService {

    @Autowired
    private companysBranchRepository repository;

}
