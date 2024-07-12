package com.br.filiaisApi.dto.request;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class CompanyBranchRequest{

    private Long id;
    private String name;
    private String cnpj;
    private String city;
    private String uf;
    private String type;
    private Boolean active;

}