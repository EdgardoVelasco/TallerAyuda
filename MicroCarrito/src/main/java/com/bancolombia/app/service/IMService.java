package com.bancolombia.app.service;

import java.util.List;

import com.bancolombia.app.entities.Product;

public interface IMService {
	List<Product> getShoppingCart();
	int totalProducts();
	boolean insertProduct(int id);

}
