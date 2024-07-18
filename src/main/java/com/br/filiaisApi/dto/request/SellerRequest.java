package com.br.filiaisApi.dto.request;

import com.br.filiaisApi.entity.ContractType;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class SellerRequest {
    private String name;
    private String cpf;
    private String email;
    private ContractType contractType;
    private CompanyBranchRequest branches;
}
