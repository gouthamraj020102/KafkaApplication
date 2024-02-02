package com.orderupdate.order.dto;

import lombok.Data;

@Data
public class Order {
    
    private int orderNumber;
    private String orderName;
    private String city;
    private String country;
    private String address;
    private int pincode;
}
