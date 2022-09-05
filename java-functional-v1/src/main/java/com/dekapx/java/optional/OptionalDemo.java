package com.dekapx.java.optional;

import java.util.Optional;

public class OptionalDemo {
    public static void main(String[] args) {
        displayCapacity(null);
        displayCapacity(Car.builder().build());
        displayCapacity(Car.builder()
                .brand("BMW")
                .color("Blue")
                .engine(Engine.builder().capacity("1995CC").build())
                .build());
    }

    private static void displayCapacity(Car car) {
        String capacity = Optional.ofNullable(car)
                .map(Car::getEngine)
                .map(Engine::getCapacity)
                .orElse("No value present");
        System.out.println("Capacity: " + capacity);
    }
}
