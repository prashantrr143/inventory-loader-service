package com.prashant.inventory.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.prashant.inventory.common.Product;

public interface ProductRepository extends MongoRepository<Product, String> {

	public Product findByName(String name);
	
}
