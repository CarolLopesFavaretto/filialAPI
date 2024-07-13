package com.br.filiaisApi.service;

import com.br.filiaisApi.dto.mapper.SellerMapper;
import com.br.filiaisApi.dto.request.SellerRequest;
import com.br.filiaisApi.entity.ContractType;
import com.br.filiaisApi.entity.Sellers;
import com.br.filiaisApi.repository.SellerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.UUID;

@Service
public class SellerService {

    @Autowired
    private SellerRepository repository;

    @Autowired
    private SellerMapper mapper;

    @Transactional
    public ResponseEntity<Sellers> saveSellers(SellerRequest sellers) {

        ContractType contractType = sellers.getContractType();

        switch (contractType) {
            case CLT:
            case PJ:
            case OUT:
                Sellers data = mapper.toData(sellers);
                data.setRegistry(getRegistry(contractType));
                return ResponseEntity.ok(repository.save(data));
            default:
                throw new RuntimeException("Tipo de contrato invalido");
        }
    }

    private String getRegistry(ContractType contractType) {
        String registry = UUID.randomUUID().toString();
        return registry + "-" + contractType;
    }
}
