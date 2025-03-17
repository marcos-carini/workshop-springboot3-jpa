package com.marcoscarini.course.repositories;

import com.marcoscarini.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
