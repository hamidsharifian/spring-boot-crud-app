package com.example.service;

import com.example.entities.Order;
import com.example.repository.OrderRepostiroty;
import com.example.service.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;



@Service
public class OrderServiceImpl implements IOrderService {

    @Autowired
    private OrderRepostiroty orderRepostiroty;


    @Override
    public Order createOrder(Order order) {
        return orderRepostiroty.save(order);
    }

    @Override
    public List<Order> getAllOrder() {
        return (List<Order>) orderRepostiroty.findAll();
    }

    @Override
    public Order getOrderById(String id) {
        Optional<Order> dbOrder = orderRepostiroty.findById(id);
        return dbOrder.orElse(null);
    }

    @Override
    public boolean deleteOrderById(String id) {
        orderRepostiroty.deleteById(id);
        return getOrderById(id) == null;
    }
}
