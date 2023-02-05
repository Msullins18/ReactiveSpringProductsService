package com.marcus.productservice.handler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;

import com.marcus.productservice.dto.ProductDto;
import com.marcus.productservice.service.ProductService;
import com.marcus.productservice.util.MapperUtil;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class ProductRouterHandler {

	@Autowired
	ProductService productService;
	
//	public Mono<ServerResponse> 
	
	public Mono<ServerResponse> getAll(ServerRequest request){
		return ServerResponse.ok().body(this.productService.getAll(), ProductDto.class);
	}
	
	public Mono<ServerResponse> handleGetProductById(ServerRequest request){
		return ServerResponse.ok().body(this.productService.getProductById(request.pathVariable("id")), ProductDto.class);
	}
	
	public Mono<ServerResponse> handleInsertProduct(ServerRequest request){
		return ServerResponse.ok().body(this.productService.insertProduct(request.bodyToMono(ProductDto.class)),ProductDto.class);
	}
	
	public Mono<ServerResponse> handleupdateProduct(ServerRequest request) {
		return ServerResponse.ok().body(this.productService.updateProduct(request.bodyToMono(ProductDto.class)),
				ProductDto.class);
	}

	public Mono<ServerResponse> handledeleteProduct(ServerRequest request) {
		return ServerResponse.ok().body(this.productService.deleteProduct(request.queryParam("id").get()),
				ProductDto.class);
	}
}
