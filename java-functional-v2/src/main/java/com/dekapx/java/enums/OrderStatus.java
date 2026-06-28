package com.dekapx.java.enums;

public enum OrderStatus {
    PENDING("Order is waiting for processing"),
    PROCESSING("Order is currently being handled"),
    SHIPPED("Order has left the warehouse"),
    DELIVERED("Order has reached the customer"),
    CANCELLED("Order has been cancelled");

    private final String description;

    // Enum constructor (implicitly private)
    OrderStatus(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public boolean isFinalState() {
        return this == DELIVERED || this == CANCELLED;
    }

    static void main() {
        OrderStatus orderStatus = OrderStatus.DELIVERED;
        System.out.println(orderStatus.name() + ": " + orderStatus.getDescription());

        System.out.println("Final State: " + orderStatus.isFinalState());

        for (OrderStatus status : OrderStatus.values()) {
            System.out.println(status.name() + ": " + status.getDescription());
        }
    }
}
