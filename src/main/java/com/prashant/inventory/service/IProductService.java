package com.prashant.inventory.service;

import java.util.List;

import com.prashant.inventory.common.Product;

public interface IProductService {

	public List<Product> findProducts();
	
	public Product save(Product product);
}
