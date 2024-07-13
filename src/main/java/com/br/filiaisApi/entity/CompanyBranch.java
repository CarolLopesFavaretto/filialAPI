package com.br.filiaisApi.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.hibernate.validator.constraints.br.CNPJ;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class CompanyBranch {

    @Column(insertable = false, updatable = false)
    private String name;

    @CNPJ
    private String cnpj;

    private String city;

    private String uf;

    private String type;

    private Boolean active = Boolean.TRUE;

    @CreationTimestamp
    private LocalDate register;

    @UpdateTimestamp
    private LocalDateTime updateTime;

}
