package com.marcus.productservice.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.marcus.productservice.dto.ProductDto;
import com.marcus.productservice.service.ProductService;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController()
@RequestMapping(path = "product")
public class ProductController {
	
	@Autowired
	private ProductService productService;

	@GetMapping("all")
	public Flux<ProductDto> getAllProducts(){
		return this.productService.getAll();
	}
	@GetMapping("by/{id}")
	public Mono<ProductDto> getById(@RequestParam Long id){
		return this.productService.getProductById(id);
	}
	@PostMapping("create")
	public Mono<ProductDto> createProduct(@RequestBody Mono<ProductDto> prod){
		return this.productService.insertProduct(prod);
	}
	
	@PutMapping("update")
	Mono<ProductDto> updateProduct(@RequestBody Mono<ProductDto> prod) {
		return this.productService.updateProduct(prod);
	}
	
	@DeleteMapping("delete/{id}")
	public void deleteProduct(@RequestParam Long id) {
		this.productService.deleteProduct(id);
	}
}
