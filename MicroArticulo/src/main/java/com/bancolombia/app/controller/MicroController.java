package com.bancolombia.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bancolombia.app.entities.Product;
import com.bancolombia.app.service.IPService;

@RestController
@RequestMapping("/product")
public class MicroController {
	
	@Autowired
	private IPService service;
	
	@PostMapping
	public Product insert(@RequestBody Product pr) {
		return service.insert(pr);
	}
	
	@GetMapping("/{id}")
	public Product findById(@PathVariable("id") int id) {
		return service.findById(id);
	}
	
	@GetMapping
	public List<Product> findAll(){
		return service.getAll();
	}
}
