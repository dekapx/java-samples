package com.dekapx.java.concurrency;

import com.dekapx.java.model.Item;
import com.dekapx.java.model.Order;
import com.dekapx.java.model.OrderStatus;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CompletionStageDemo {
    private static ExecutorService executorService  = Executors.newFixedThreadPool(5);
    static void main() {
        try {
            // complete the stage with create order
            CompletionStage<Order> completionStage = CompletableFuture.completedStage(createOrder());

            // complete order and process order asynchronously
            CompletableFuture<String> resultFuture = completionStage
                    .thenApplyAsync(order -> processOrder(order), executorService)
                    .toCompletableFuture();

            System.out.println(resultFuture.join());
        } finally {
            executorService.shutdown();
        }
    }

    private static Order createOrder() {
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

    private static String processOrder(Order order) {
        System.out.println("Processing order: " + order.getOrderId());
        order.getItems().forEach(item -> {
            System.out.println("Processing item: " + item.getItemName());
        });
        return "Order Completed";
    }
}
