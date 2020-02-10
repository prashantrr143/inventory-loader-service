package com.prashant.inventory.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.prashant.inventory.commom.model.Product;

@Repository
public interface ProductRepository extends MongoRepository<Product, String> {

	public Product findByName(String name);
	
}
