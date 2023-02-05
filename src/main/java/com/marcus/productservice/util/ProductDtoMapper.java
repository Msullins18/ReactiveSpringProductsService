package com.marcus.productservice.util;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.marcus.productservice.dto.ProductDto;
import com.marcus.productservice.entity.ProductEntity;

@Mapper
public interface ProductDtoMapper {

	ProductDtoMapper INSTANCE = Mappers.getMapper(ProductDtoMapper.class);
	
	ProductDto entityToDto(ProductEntity entity);
}
