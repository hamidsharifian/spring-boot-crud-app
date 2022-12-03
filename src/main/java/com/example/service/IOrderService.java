package com.example.service;

import com.example.entities.Order;

import java.util.List;


public interface IOrderService {


    Order createOrder(Order order);

    List<Order> getAllOrder();

    Order getOrderById(String id);

    boolean deleteOrderById(String id);
}
