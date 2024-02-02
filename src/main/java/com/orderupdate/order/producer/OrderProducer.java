package com.orderupdate.order.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Repository;
import com.orderupdate.order.util.Constants;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Repository
public class OrderProducer {

    @Autowired
    KafkaTemplate<String, String> kafkaProducer;

    public String postOrderIdToTopic(String id) {
        kafkaProducer.send(Constants.name, id);
        log.info("Order id {} created successfully", id);
        return id;
    }
}
