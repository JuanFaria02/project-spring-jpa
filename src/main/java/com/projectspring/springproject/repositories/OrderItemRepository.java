package com.projectspring.springproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projectspring.springproject.entities.OrderItem;
import com.projectspring.springproject.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{
}
