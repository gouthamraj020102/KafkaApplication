package com.orderupdate.order.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.orderupdate.order.dto.Order;
import com.orderupdate.order.producer.OrderProducer;

@Service
public class OrderService {
    
    @Autowired
    private OrderProducer orderProducer;

    public Order orderCreation(Order order) {
        return orderProducer.postOrderToTopic(order);
    }
}
