package com.javacourse.webserviceproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javacourse.webserviceproject.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
