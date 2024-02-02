package com.orderupdate.order.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Repository;
import com.orderupdate.order.dto.Order;
import com.orderupdate.order.util.Constants;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Repository
public class OrderProducer {

    @Autowired
    KafkaTemplate<String, Order> kafkaProducer;

    public Order postOrderToTopic(Order order) {
        kafkaProducer.send(Constants.name, order);
        log.info("Order created successfully");
        return order;
    }
}
