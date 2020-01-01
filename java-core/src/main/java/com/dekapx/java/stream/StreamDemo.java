package com.dekapx.java.stream;

import com.dekapx.java.model.Item;
import com.dekapx.java.model.Order;

import java.util.AbstractMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.stream.Collectors;


public class StreamDemo {
    public static void main(String[] args) {
        final List<Order> orders = List.of(getOrder());
        final Map<String, String> elements = orders.stream()
                .flatMap(i -> i.getItems()
                        .stream()
                        .map(j -> new AbstractMap.SimpleImmutableEntry<>(i.getType(), j.getName())))
                .collect(Collectors.toMap(entry -> entry.getKey(), entry -> entry.getValue()));
        printElements(elements);
    }

    private static void printElements(final Map<String, String> elements) {
        elements.entrySet().forEach(e -> consumer.accept(e));
    }

    private static Consumer<Map.Entry> consumer = (entry) -> {
        System.out.print(entry.getKey() + " {" + entry.getValue() + "}");
    };

    private static Order getOrder() {
        return Order.builder()
                .id(1L)
                .type("Software")
                .items(List.of(Item.builder()
                        .id(1L)
                        .name("Windows 10")
                        .quantity(1)
                        .price(21.99)
                        .build()))
                .build();
    }
}
