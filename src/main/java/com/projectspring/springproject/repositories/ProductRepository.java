package com.projectspring.springproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projectspring.springproject.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
}
