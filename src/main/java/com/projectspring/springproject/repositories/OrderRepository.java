package com.projectspring.springproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projectspring.springproject.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
