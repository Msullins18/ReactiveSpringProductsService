package com.marcus.productservice.entity;

import org.springframework.data.annotation.Id;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class ProductEntity {

	@Id
	private String id;
	private String desc;
	private Integer price;
}
