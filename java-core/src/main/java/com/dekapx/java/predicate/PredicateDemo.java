package com.dekapx.java.predicate;

import com.dekapx.java.model.Apple;
import com.dekapx.java.model.Color;

public class PredicateDemo {
    public static void main(String[] args) {
        Color color = Color.RED;
        int weight = 175;

        final Apple apple = Apple.builder()
                .type("Empire")
                .color(Color.RED)
                .weight(250).build();

        if (apple.getColor().equals(color) && apple.getWeight() > weight) {
            System.out.println("Red and Heavy Apple");
        }
    }
}
