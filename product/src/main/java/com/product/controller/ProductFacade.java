package com.product.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.product.Product;
import com.product.ProductResponseDto;

@Component
public class ProductFacade {
	
	public ProductResponseDto getProducts(){
		ProductResponseDto products = new ProductResponseDto();
		products.newList();
		products.add(generateProduct(1, "Gears 5"));
		products.add(generateProduct(2, "Forza Horizon 4"));
		products.add(generateProduct(3, "Assassins creed odyssey"));
		products.add(generateProduct(4, "Dungeon siege 3"));
		
		return products;
	}
	
	public ProductResponseDto getProductsById(Integer customerId){
		ProductResponseDto products = new ProductResponseDto();
		products.newList();
		products.add(generateProduct(1, customerId.toString()));
		products.add(generateProduct(2, customerId.toString()));
		
		return products;
	}
	
	private Product generateProduct(Integer productId, String productName) {
		Product product = new Product();
		
		product.setProductId(productId);
		product.setProductName(productName);
		
		return product;
	}
}
