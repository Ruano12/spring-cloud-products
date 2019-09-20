package com.product;

import java.util.ArrayList;
import java.util.List;

public class ProductResponseDto {
	
	
	private List<Product> products;

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}
	
	public void newList() {
		products = new ArrayList<Product>();
	}
	
	public void add(Product product) {
		products.add(product);
	}
}
