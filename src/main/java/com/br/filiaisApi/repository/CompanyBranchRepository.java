package com.br.filiaisApi.repository;

import com.br.filiaisApi.domain.entity.CompanyBranch;
import com.br.filiaisApi.dto.request.CompanyBranchRequest;
import com.br.filiaisApi.dto.response.CompanyBranchResponse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompanyBranchRepository extends JpaRepository<CompanyBranch, Long> {

//    CompanyBranch saveCompany(CompanyBranchRequest request);
}
