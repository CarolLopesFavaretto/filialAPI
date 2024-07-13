package com.br.filiaisApi.dto.mapper;

import com.br.filiaisApi.entity.CompanyBranch;
import com.br.filiaisApi.dto.request.CompanyBranchRequest;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.WARN)
public interface CompanyMapper {

    CompanyMapper INSTANCE = Mappers.getMapper(CompanyMapper.class);

    CompanyBranch toData(CompanyBranchRequest request);

}

