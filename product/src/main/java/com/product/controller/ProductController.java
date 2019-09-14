package com.product.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.google.common.collect.ImmutableMap;

@RestController
@RequestMapping("/products")
public class ProductController {
	@GetMapping
    public ImmutableMap<Long,String> findAll() {
        return ImmutableMap.of(
            1L, "Product 1",
            2L, "Product 2",
            3L, "Product 3",
            4L, "Product 4");
    }
}
