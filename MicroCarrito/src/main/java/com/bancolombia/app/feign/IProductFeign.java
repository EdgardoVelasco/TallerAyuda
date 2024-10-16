package com.bancolombia.app.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.bancolombia.app.entities.Product;

@FeignClient(name="micro-articulo", url = "http://localhost:8081/product")
public interface IProductFeign {
	 
	@GetMapping("/{id}")
	Product findById(@PathVariable("id") int id);

}
