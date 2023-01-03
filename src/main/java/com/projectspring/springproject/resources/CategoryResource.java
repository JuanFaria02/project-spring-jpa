package com.projectspring.springproject.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projectspring.springproject.entities.Category;
import com.projectspring.springproject.services.CategoryServices;

@RestController
@RequestMapping(value="/categories")
public class CategoryResource {
	@Autowired
	private CategoryServices categoryServices;
	
	@GetMapping
	public ResponseEntity<List<Category>> findAll(){
		List<Category> listCategories = categoryServices.findAll();
		return ResponseEntity.ok().body(listCategories);
	}
	
	@GetMapping(value= "/{id}")
	public ResponseEntity<Category> findById(@PathVariable Long id) {
		Category category = categoryServices.findById(id);
		return ResponseEntity.ok().body(category);
	}
}