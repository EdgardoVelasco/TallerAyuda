package com.bancolombia.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bancolombia.app.entities.Product;
import com.bancolombia.app.service.IMService;

@RestController
@RequestMapping("/cart")
public class MicroController {
	@Autowired
	private IMService service;

	@GetMapping
	public List<Product> all(){
		return service.getShoppingCart();
	}
	
	@GetMapping("/total")
	public int total() {
		return service.totalProducts();
	}
	
	@PostMapping("/{id}")
	public boolean insert(@PathVariable("id") int id) {
		return service.insertProduct(id);
	}

}
