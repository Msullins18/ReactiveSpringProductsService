package com.marcus.productservice.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Table(name = "product", schema = "products")
public class ProductEntity {

	@Id
	private Long id;
	private String description;
	private Integer price;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDesc() {
		return description;
	}
	public void setDesc(String desc) {
		this.description = desc;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "ProductEntity [id=" + id + ", desc=" + description + ", price=" + price + "]";
	}
}
