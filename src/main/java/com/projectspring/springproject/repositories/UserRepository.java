package com.projectspring.springproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projectspring.springproject.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
	
}
