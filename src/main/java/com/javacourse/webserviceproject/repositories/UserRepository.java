package com.javacourse.webserviceproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javacourse.webserviceproject.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
