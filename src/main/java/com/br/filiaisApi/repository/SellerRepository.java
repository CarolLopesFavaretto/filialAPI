package com.br.filiaisApi.repository;

import com.br.filiaisApi.entity.Sellers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SellerRepository extends JpaRepository<Sellers, String> {
}
