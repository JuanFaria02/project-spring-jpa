package com.projectspring.springproject.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projectspring.springproject.entities.Product;
import com.projectspring.springproject.services.ProductServices;

@RestController
@RequestMapping(value="/products")
public class ProductResource {
	
	@Autowired
	private ProductServices productServices;
	
	@GetMapping
	public ResponseEntity<List<Product>> findAll(){
		List<Product> productList = productServices.findAll();
		return ResponseEntity.ok().body(productList);
	}
	
	@GetMapping(value= "/{id}")
	public ResponseEntity<Product> findById(@PathVariable Long id){
		Product product = productServices.findById(id);
		return ResponseEntity.ok().body(product);
	}
	
}
