package com.marcoscarini.course.repositories;

import com.marcoscarini.course.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
