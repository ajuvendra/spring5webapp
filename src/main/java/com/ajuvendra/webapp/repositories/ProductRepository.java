package com.ajuvendra.webapp.repositories;

import org.springframework.data.repository.CrudRepository;

import com.ajuvendra.webapp.domain.Product;

public interface ProductRepository extends CrudRepository<Product, Integer>{
}
