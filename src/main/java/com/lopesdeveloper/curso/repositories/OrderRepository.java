package com.lopesdeveloper.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lopesdeveloper.curso.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
