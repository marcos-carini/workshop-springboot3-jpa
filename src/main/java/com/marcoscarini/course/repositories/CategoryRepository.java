package com.marcoscarini.course.repositories;

import com.marcoscarini.course.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
