package com.br.filiaisApi.dto.mapper;

import com.br.filiaisApi.dto.request.SellerRequest;
import com.br.filiaisApi.entity.Sellers;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.WARN)
public interface SellerMapper {

    SellerMapper INSTANCE = Mappers.getMapper(SellerMapper.class);

    Sellers toData(SellerRequest request);
}
