package com.lucasbazzani.course.repositories;

import com.lucasbazzani.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}