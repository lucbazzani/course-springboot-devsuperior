package com.lucasbazzani.course.repositories;

import com.lucasbazzani.course.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}