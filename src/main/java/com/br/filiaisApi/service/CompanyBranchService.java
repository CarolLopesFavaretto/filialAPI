package com.br.filiaisApi.service;

import com.br.filiaisApi.domain.entity.CompanyBranch;
import com.br.filiaisApi.dto.mapper.CompanyMapper;
import com.br.filiaisApi.dto.request.CompanyBranchRequest;
import com.br.filiaisApi.repository.CompanyBranchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class CompanyBranchService {

    @Autowired
    private CompanyBranchRepository repository;

    @Autowired
    private CompanyMapper mapper;


    public ResponseEntity<CompanyBranch> saveCompany(CompanyBranchRequest request) {
        CompanyBranch data = mapper.toData(request);
        return ResponseEntity.status(HttpStatus.OK).body(repository.save(data));
    }
}
