package com.prashant.inventory.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prashant.inventory.common.Product;
import com.prashant.inventory.service.IProductService;

@RestController
@RequestMapping("/v1/products")
public class ProductController {
	
	private static final Logger LOG = LoggerFactory.getLogger(ProductController.class);
	@Autowired
	private IProductService productService;
	
	@GetMapping
	public List<Product> getProducts(){
		LOG.info("@Controller getProducts invoked");
		return productService.findProducts();
	}
	
	@PostMapping
	public Product createProduct(Product product){
		LOG.info("@Controller createProduct invoked for {} ", product);
		return productService.save(product);
	}
}
