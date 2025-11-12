package com.generic.code.repository;

import com.generic.code.entity.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path="order-items")
public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {}