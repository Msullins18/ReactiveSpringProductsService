package com.marcus.productservice.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

import com.marcus.productservice.handler.ProductRouterHandler;

@Configuration
public class ProductRouter {
	
	@Autowired
	ProductRouterHandler handler;

	@Bean
	public RouterFunction<ServerResponse> baseRouter(){
		return RouterFunctions.route()
				.path("functional/product", this::productRouterFunction)
				.build();
	}
	
	private RouterFunction<ServerResponse> productRouterFunction(){
		return RouterFunctions.route()
				.GET("get/all", handler::getAll)
				.GET("get/{id}", handler::handleGetProductById)
				.POST("create", handler::handleInsertProduct)
				.PUT("update", handler::handleupdateProduct)
				.DELETE("delete/{id}", handler::handledeleteProduct)
				.build();
	}
}
