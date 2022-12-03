package com.example.controller;

import com.example.entities.Order;
import com.example.service.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class OrderController {


    @Autowired
    private IOrderService orderService;

    @PostMapping("/order")
    public ResponseEntity<Order> saveOrder(@RequestBody Order order) {
        return new ResponseEntity<>(orderService.createOrder(order), HttpStatus.OK);
    }

    @GetMapping("/order")
    public ResponseEntity<List<Order>> getAllOrder() {
        return new ResponseEntity<>(orderService.getAllOrder(), HttpStatus.OK);
    }

    @GetMapping("/order/{id}")
    public ResponseEntity<Order> getOrderById(@PathVariable String id) {
        return new ResponseEntity<>(orderService.getOrderById(id), HttpStatus.OK);

    }

    @DeleteMapping("/order/{id}")
    public boolean deleteOrder(@PathVariable String id) {
        return orderService.deleteOrderById(id);
    }


}
