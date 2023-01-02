package com.projectspring.springproject.resources;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projectspring.springproject.entities.User;
import com.projectspring.springproject.services.UserServices;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	@Autowired
	private UserServices userServices;
	
    @GetMapping
    public ResponseEntity<List<User>> findAll() {
    	List<User> listUser = userServices.findAll();
    	
    	return ResponseEntity.ok().body(listUser);
    	
    }
    
    @GetMapping(value = "/{id}")
    public ResponseEntity<User> findById(@PathVariable Long id) {
    	User user = userServices.findById(id);
    	return ResponseEntity.ok().body(user);
    }
}
