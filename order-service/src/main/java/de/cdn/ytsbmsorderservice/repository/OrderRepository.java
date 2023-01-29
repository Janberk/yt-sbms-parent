package de.cdn.ytsbmsorderservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import de.cdn.ytsbmsorderservice.model.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
