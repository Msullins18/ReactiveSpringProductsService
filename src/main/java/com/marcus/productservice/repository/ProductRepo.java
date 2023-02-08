package com.marcus.productservice.repository;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

import com.marcus.productservice.entity.ProductEntity;

public interface ProductRepo extends ReactiveCrudRepository<ProductEntity, Long>{

	
}
