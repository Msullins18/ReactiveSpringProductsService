package com.marcus.productservice.dto;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class ProductDto {
	
	private String id;
	private String desc;
	private Integer price;

}
