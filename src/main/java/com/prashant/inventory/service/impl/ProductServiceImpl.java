package com.prashant.inventory.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.prashant.inventory.common.Product;
import com.prashant.inventory.repository.ProductRepository;
import com.prashant.inventory.service.IProductService;

@Service
public class ProductServiceImpl implements IProductService {

	private static final Logger LOG = LoggerFactory.getLogger(ProductServiceImpl.class);

	private ProductRepository repository;

	@Override
	public List<Product> findProducts() {
		LOG.info("@Service Layer: findProducts invoked");
		return repository.findAll();
	}

	@Override
	public Product save(Product product) {
		LOG.info("@Service Layer: save invoked with Product {}", product);
		return repository.save(product);
	}

}
