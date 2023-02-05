package com.marcus.productservice.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

import com.marcus.productservice.entity.ProductEntity;

@Repository
public interface ProductRepo extends ReactiveMongoRepository<ProductEntity, String>{

	
}
