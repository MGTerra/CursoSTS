package com.example.Curso1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Curso1.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
