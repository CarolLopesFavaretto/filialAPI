package com.br.filiaisApi.entity;

import com.fasterxml.jackson.annotation.JsonCreator;

public enum ContractType {

    CLT("CLT"), PJ("Pessoa Juridica"), OUT("Terceiros");

    private String description;
    ContractType(String description) {
        this.description = description;
    }

    @JsonCreator
    public static ContractType fromString(String value) {
        for (ContractType contractType : ContractType.values()) {
            if (contractType.name().equalsIgnoreCase(value)) {
                return contractType;
            }
        }
        throw new RuntimeException("Tipo de contrato invalido: " + value);
    }
}
