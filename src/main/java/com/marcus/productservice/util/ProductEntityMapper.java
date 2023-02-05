package com.marcus.productservice.util;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.marcus.productservice.dto.ProductDto;
import com.marcus.productservice.entity.ProductEntity;

@Mapper
public interface ProductEntityMapper {

	ProductEntityMapper INSTANCE = Mappers.getMapper(ProductEntityMapper.class);
	
	ProductEntity dtoToEntity(ProductDto dto);
}
