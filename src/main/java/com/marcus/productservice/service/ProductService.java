package com.marcus.productservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marcus.productservice.dto.ProductDto;
import com.marcus.productservice.repository.ProductRepo;
import com.marcus.productservice.util.MapperUtil;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class ProductService {

	@Autowired
	private ProductRepo productRepo;
	
	public Flux<ProductDto> getAll(){
		return this.productRepo.findAll().map(MapperUtil::entityToDto);
	}
	
	public Mono<ProductDto> getProductById(Long id){
		return this.productRepo.findById(id).map(MapperUtil::entityToDto);
	}
	
	public Mono<ProductDto> insertProduct(Mono<ProductDto> product){
		return product
				.map(MapperUtil::dtoToEntity)
				.flatMap(this.productRepo::save)
				.map(MapperUtil::entityToDto);
	}
	
	public Mono<ProductDto> updateProduct(Mono<ProductDto> dto){
		return this.productRepo.findById(dto.map(d -> d.getId()))
				.flatMap(p -> dto.map(MapperUtil::dtoToEntity))
				.flatMap(this.productRepo::save)
				.map(MapperUtil::entityToDto);
	}
	
	public Mono<Void> deleteProduct(Long id) {
		return this.productRepo.deleteById(id);
	}
}
