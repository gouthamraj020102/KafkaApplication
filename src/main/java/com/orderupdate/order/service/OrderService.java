package com.orderupdate.order.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.orderupdate.order.producer.OrderProducer;

@Service
public class OrderService {
    
    @Autowired
    private OrderProducer orderProducer;

    public String sendOrder(String id) {
        return orderProducer.postOrderIdToTopic(id);
    }
}
