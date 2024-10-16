package com.bancolombia.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bancolombia.app.dao.IDAO;
import com.bancolombia.app.entities.Product;

@Service
public class PServiceImpl implements IPService {
	
	@Autowired
	private IDAO dao;

	@Override
	public Product insert(Product pr) {
		
		return dao.save(pr);
	}

	@Override
	public List<Product> getAll() {
		
		return (List<Product>)dao.findAll();
	}

	@Override
	public Product findById(int id) {
		
		return dao.findById(id)
				.orElseThrow();
	}
	
	
	

}
