package com.bancolombia.app.service;

import java.util.List;

import com.bancolombia.app.entities.Product;

public interface IPService {
	Product insert(Product pr);
	List<Product> getAll();
	Product findById(int id);

}
