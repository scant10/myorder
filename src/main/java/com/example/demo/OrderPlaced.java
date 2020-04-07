package com.example.demo;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class OrderPlaced {

    String eventType;
    Long orderId;
    Long productId;
    int qty;
    String productName;

    public OrderPlaced() {
        this.eventType = OrderPlaced.class.getSimpleName();
    }
}
