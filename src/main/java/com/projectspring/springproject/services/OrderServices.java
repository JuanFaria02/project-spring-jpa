package com.projectspring.springproject.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projectspring.springproject.entities.Order;
import com.projectspring.springproject.repositories.OrderRepository;

@Service
public class OrderServices {
	@Autowired
	private OrderRepository orderRepository;
	
	public List<Order> findAll() {
		return orderRepository.findAll();
	}
	

	public Order findById(Long id) {
		
		Optional<Order> obj = orderRepository.findById(id);
		return obj.get();
	}
}
