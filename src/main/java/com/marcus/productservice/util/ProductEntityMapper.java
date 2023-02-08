package com.marcus.productservice.util;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Component;

import com.marcus.productservice.dto.ProductDto;
import com.marcus.productservice.entity.ProductEntity;

@Mapper(componentModel = "spring", uses = MapperUtil.class)
public interface ProductEntityMapper {

	public static final ProductEntityMapper INSTANCE = Mappers.getMapper(ProductEntityMapper.class);
	
	ProductEntity dtoToEntity(ProductDto dto);
}
