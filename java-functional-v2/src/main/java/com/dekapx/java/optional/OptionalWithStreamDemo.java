package com.dekapx.java.optional;

import com.dekapx.java.model.Item;
import com.dekapx.java.model.Order;
import com.dekapx.java.model.User;

import java.util.List;
import java.util.Optional;

/**
 * Demonstrates the use of Optional with Stream API
 * to safely navigate through nested objects.
 * No specific null check required as Optional handles it.
 */
public class OptionalWithStreamDemo {
    static void main() {
        String itemName = getUser()
                .stream()
                .flatMap(user -> user.getOrders().stream())
                .flatMap(order -> order.getItems().stream())
                .map(item -> item.getItemName())
                .findFirst()
                .orElse("Default Item");
        System.out.println("Item Name: " + itemName);
    }


    private static Optional<User> getUser() {
        return Optional.of(User.builder()
                .userId(1L)
                .username("john_doe")
                .email("john.doe@gmail.com")
                .orders(List.of(getOrder()))
                .build());
    }

    private static Order getOrder() {
        return Order.builder()
                .orderId(1L)
                .items(List.of(getItem()))
                .build();
    }
    private static Item getItem() {
        return Item.builder()
                .itemId(1L)
                .itemName("MacBook Pro")
                .price(100.0)
                .build();
    }
}
