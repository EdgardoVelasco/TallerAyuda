package com.bancolombia.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bancolombia.app.entities.Product;
import com.bancolombia.app.entities.ShoppingCart;
import com.bancolombia.app.feign.IProductFeign;

@Service
public class MServiceImpl implements IMService{
	
	@Autowired
    private IProductFeign feign;
	
	@Autowired
	private ShoppingCart cart;
	
	@Override
	public List<Product> getShoppingCart() {
		
		return cart.getProducts();
	}

	@Override
	public int totalProducts() {
		
		return (int)cart.getProducts().stream()
				.count();
	}

	@Override
	public boolean insertProduct(int id) {
		try {
			Product pr=feign.findById(id);
			
			return this.cart.getProducts().add(pr);
			
		}catch(Exception ex) {
			System.out.println("ERROR:" +ex);
		}
		
		
		return false;
	}
	
	

}
