package com.java.example.product.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.java.example.product.beans.Product;


@RestController
@RequestMapping("/product")
public class ProductController {

	
	
	@GetMapping(value="/{productId}")
	public Product getProductDetail(@PathVariable String productId){
		System.out.print("Product Id "+ productId);
		Product product = productMap.get(productId);
		System.out.print("Product Detail "+ product);
		
		return product;
	}
	
	static Map<String, Product> productMap = new HashMap<String, Product>();
	static{
		productMap.put("P10001", new Product("P10001", "Mobile", 3456.98));
		productMap.put("P10002", new Product("P10002", "Laptop", 2656.98));
		productMap.put("P10003", new Product("P10003", "Mobile Battry", 356.98));
		productMap.put("P10004", new Product("P10004", "Laptop Battry", 956.98));
	}
}
