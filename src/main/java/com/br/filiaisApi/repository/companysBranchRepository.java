package com.br.filiaisApi.repository;

import com.br.filiaisApi.domain.entity.companysBranch;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface companysBranchRepository extends JpaRepository<companysBranch, Long> {
}
