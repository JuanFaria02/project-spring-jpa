package com.projectspring.springproject.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projectspring.springproject.entities.Order;
import com.projectspring.springproject.services.OrderServices;

@RestController
@RequestMapping(value = "/orders")
public class OrderResource {
	
	@Autowired
	private OrderServices orderServices;
	
	@GetMapping
	public ResponseEntity<List<Order>> findAll(){
		List<Order> listOrder = orderServices.findAll();
		return ResponseEntity.ok().body(listOrder);
	}
	
	@GetMapping(value="/{id}")
	public ResponseEntity<Order> findById(@PathVariable Long id) {
		Order order = orderServices.findById(id);
		return ResponseEntity.ok().body(order);
	}
}
