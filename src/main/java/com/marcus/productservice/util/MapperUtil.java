package com.marcus.productservice.util;

import org.springframework.stereotype.Component;

import com.marcus.productservice.dto.ProductDto;
import com.marcus.productservice.entity.ProductEntity;

@Component
public class MapperUtil {
	
	public static ProductDto entityToDto (ProductEntity entity) {
		System.out.println(entity);
		ProductDto ent = ProductDtoMapper.INSTANCE.entityToDto(entity);
		System.out.println(ent);
		return ent;
	}
	
	public static ProductEntity dtoToEntity (ProductDto dto) {
		System.out.println(dto);
		ProductEntity ent = ProductEntityMapper.INSTANCE.dtoToEntity(dto);
		System.out.println(ent);
		return ent;
	}
}
