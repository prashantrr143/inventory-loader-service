package com.prashant.inventory.service;

import java.util.List;

import com.prashant.inventory.commom.model.Product;

public interface IProductService {

	public List<Product> getProducts();
	
	public Product getProductById(String productId);
	
	public Product save(Product product);
}
