package com.marcus.productservice.util;

import com.marcus.productservice.dto.ProductDto;
import com.marcus.productservice.entity.ProductEntity;

public class MapperUtil {
	
	public static ProductDto entityToDto (ProductEntity entity) {
		return ProductDtoMapper.INSTANCE.entityToDto(entity);
	}
	
	public static ProductEntity dtoToEntity (ProductDto dto) {
		return ProductEntityMapper.INSTANCE.dtoToEntity(dto);
	}
}
