package com.javacourse.webserviceproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javacourse.webserviceproject.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
