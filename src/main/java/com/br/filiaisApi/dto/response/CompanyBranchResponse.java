package com.br.filiaisApi.dto.response;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class CompanyBranchResponse {

    private Long id;
    private String name;
    private String cnpj;
    private String city;
    private String uf;
    private String type;
    private Boolean active;
    private LocalDate register;
    private LocalDateTime updateTime;
}
