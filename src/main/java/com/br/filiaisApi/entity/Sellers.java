package com.br.filiaisApi.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.br.CPF;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Sellers {

    @Id
    private String registry;

    private String name;

    @CPF
    private String cpf;

    @Email
    private String email;

    private ContractType contractType;

    private CompanyBranch branches;

}




