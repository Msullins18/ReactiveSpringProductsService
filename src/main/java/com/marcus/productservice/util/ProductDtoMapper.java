package com.marcus.productservice.util;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

import com.marcus.productservice.dto.ProductDto;
import com.marcus.productservice.entity.ProductEntity;

@Mapper(componentModel = "spring", uses = MapperUtil.class)
public interface ProductDtoMapper {

	public static final ProductDtoMapper INSTANCE = Mappers.getMapper(ProductDtoMapper.class);
	
	ProductDto entityToDto(ProductEntity entity);
}
