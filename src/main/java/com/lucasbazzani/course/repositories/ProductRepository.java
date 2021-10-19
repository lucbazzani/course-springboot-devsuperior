package com.lucasbazzani.course.repositories;

import com.lucasbazzani.course.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}