package com.br.filiaisApi.dto.mapper;

import com.br.filiaisApi.domain.entity.CompanyBranch;
import com.br.filiaisApi.dto.request.CompanyBranchRequest;
import com.br.filiaisApi.dto.response.CompanyBranchResponse;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.WARN)

public interface CompanyMapper {

    CompanyMapper INSTANCE = Mappers.getMapper(CompanyMapper.class);

    CompanyBranch toData(CompanyBranchRequest request);

}

