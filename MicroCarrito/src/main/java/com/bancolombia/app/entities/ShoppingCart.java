package com.bancolombia.app.entities;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class ShoppingCart {
	private List<Product> products;
	
	public ShoppingCart() {
		this.products=new ArrayList<>();
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}
	
	

}
