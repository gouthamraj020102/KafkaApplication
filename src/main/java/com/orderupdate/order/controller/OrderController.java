package com.orderupdate.order.controller;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.orderupdate.order.service.OrderService;

import jakarta.websocket.server.PathParam;
import lombok.RequiredArgsConstructor;

import com.orderupdate.order.dto.Order;

@RestController
@RequiredArgsConstructor
public class OrderController {
    
    private final OrderService orderService;

    // @PostMapping("/order")
    // public Order createOrder(@RequestBody Order order) {
    //     return orderService.orderCreation(order);
    // }

    @Scheduled(fixedRate = 5000)
    @PostMapping("/orderId")
    public String orderId(@PathParam("id") String id) {
        return orderService.sendOrder(id);
    }
}
