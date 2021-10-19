package com.lucasbazzani.course.repositories;

import com.lucasbazzani.course.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}