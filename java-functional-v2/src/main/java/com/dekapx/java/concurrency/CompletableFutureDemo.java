package com.dekapx.java.concurrency;


import com.dekapx.java.model.Item;
import com.dekapx.java.model.Order;
import com.dekapx.java.model.OrderStatus;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class CompletableFutureDemo {
    static void main() {
        CompletableFuture.supplyAsync(() -> buildOrder())
                .thenApply(order -> verifyOrder(order))
                .thenAccept(order -> shipOrder(order))
                .join();
    }

    private static Order buildOrder() {
        System.out.println("Building order");
        return Order.builder()
                .orderId(1L)
                .items(List.of(Item.builder()
                        .itemId(1L)
                        .itemName("Item 1")
                        .price(10.0)
                        .build()))
                .orderStatus(OrderStatus.NEW)
                .build();
    }

    private static Order verifyOrder(Order order) {
        System.out.println("Verifying order");
        order.setOrderStatus(OrderStatus.VERIFIED);
        return order;
    }

    private static String shipOrder(Order order) {
        System.out.println("Shipping order");
        return OrderStatus.COMPLETED.toString();
    }

}
