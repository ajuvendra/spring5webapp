package com.ajuvendra.webapp.services;

import com.ajuvendra.webapp.domain.Product;

public interface ProductService {
	
	Iterable<Product> listAllProducts();

	Product getProductById(Integer id);

	Product saveProduct(Product product);
}
