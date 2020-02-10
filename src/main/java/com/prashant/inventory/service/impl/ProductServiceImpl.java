package com.prashant.inventory.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prashant.inventory.commom.model.Product;
import com.prashant.inventory.repository.ProductRepository;
import com.prashant.inventory.service.IProductService;

@Service
public class ProductServiceImpl implements IProductService {

	private static final Logger LOG = LoggerFactory.getLogger(ProductServiceImpl.class);

	@Autowired
	private ProductRepository repository;

	@Override
	public List<Product> getProducts() {
		LOG.info("@Service Layer: findProducts invoked");
		return repository.findAll();
	}
	
	@Override
	public Product getProductById(String productId) {
		LOG.info("@Service Layer: getProductById invoked for id : {}", productId);
		return repository.findById(productId).get();
	}


	@Override
	public Product save(Product product) {
		LOG.info("@Service Layer: save invoked with Product {}", product);
		return repository.save(product);
	}
	

}
