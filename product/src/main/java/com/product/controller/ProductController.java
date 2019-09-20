package com.product.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.google.common.collect.ImmutableMap;
import com.product.ProductResponseDto;

@RestController
@RequestMapping("")
public class ProductController {
	
	@Autowired
	private ProductFacade productFacade;
	
	@GetMapping
    public ImmutableMap<Long,String> findAll() {
        return ImmutableMap.of(
            1L, "Product 1",
            2L, "Product 2",
            3L, "Product 3",
            4L, "Product 4");
    }
	
	@RequestMapping(value = "/product-client", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ProductResponseDto getProducts() {
		return productFacade.getProducts();
	}
	
	@RequestMapping(value = "/product-client-by-id", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ProductResponseDto getProductsById(@RequestParam("customer-id") Integer customerId) {
		return productFacade.getProductsById(customerId);
	}
}
