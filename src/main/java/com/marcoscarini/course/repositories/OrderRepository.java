package com.marcoscarini.course.repositories;

import com.marcoscarini.course.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
