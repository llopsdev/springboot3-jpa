package com.lopesdeveloper.curso.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lopesdeveloper.curso.entities.Order;
import com.lopesdeveloper.curso.entities.User;
import com.lopesdeveloper.curso.service.OrderService;
import com.lopesdeveloper.curso.service.UserService;

@RestController
@RequestMapping(value = "/orders")
public class OrderResource {
	
	@Autowired
	private OrderService orderService;
	
	@GetMapping
	public ResponseEntity<List<Order>> findAll(){
		List<Order> listOrder = orderService.findAll();
		return ResponseEntity.ok().body(listOrder);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Order> findById(@PathVariable Long id){
		Order o = orderService.findById(id);
		return ResponseEntity.ok().body(o);
	}
	
}
