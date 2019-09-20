package com.product;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Product {

	@JsonProperty(value="product-id")
	private Integer productId;
	
	@JsonProperty(value="product-name")
	private String productName;

	public Integer getProductId() {
		return productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}
	
	
}
