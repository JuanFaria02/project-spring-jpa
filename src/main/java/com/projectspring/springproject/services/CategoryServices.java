package com.projectspring.springproject.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projectspring.springproject.entities.Category;
import com.projectspring.springproject.repositories.CategoryRepository;

@Service
public class CategoryServices {
	@Autowired
	private CategoryRepository categoryRepository;
	
	public List<Category> findAll(){
		return categoryRepository.findAll();
	}
	
	public Category findById(Long id) {
		
		Optional<Category> obj = categoryRepository.findById(id);
		return obj.get();
	}
}
