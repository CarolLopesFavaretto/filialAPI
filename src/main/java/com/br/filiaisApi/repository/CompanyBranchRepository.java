package com.br.filiaisApi.repository;

import com.br.filiaisApi.domain.entity.CompanyBranch;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompanyBranchRepository extends JpaRepository<CompanyBranch, Long> {

}
