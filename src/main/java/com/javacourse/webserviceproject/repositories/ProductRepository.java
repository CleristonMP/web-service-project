package com.javacourse.webserviceproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javacourse.webserviceproject.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
