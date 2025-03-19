package com.marcoscarini.course.repositories;

import com.marcoscarini.course.entities.OrderItem;
import com.marcoscarini.course.entities.User;
import com.marcoscarini.course.entities.pk.OrderItemPK;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {
}
