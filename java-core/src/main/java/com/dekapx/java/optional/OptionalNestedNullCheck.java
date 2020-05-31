package com.dekapx.java.optional;

import com.dekapx.java.model.Car;
import com.dekapx.java.model.Engine;

import java.util.Optional;

public class OptionalNestedNullCheck {
    public static void main(String[] args) {
        String capacity = Optional.ofNullable(getCarWithAttributes())
                .map(Car::getEngine)
                .map(Engine::getCapacity)
                .orElseThrow(() -> new IllegalArgumentException("Must not be null or empty."));

        System.out.println("Engine Capacity: " + capacity);
        capacity = Optional.ofNullable(getCarWithoutAttributes())
                .map(Car::getEngine)
                .map(Engine::getCapacity)
                .orElseThrow(() -> new IllegalArgumentException("Must not be null or empty."));
        System.out.println("Engine Capacity: " + capacity);
    }

    private static Car getCarWithAttributes() {
        return new Car(new Engine("1995 CC"));
    }

    private static Car getCarWithoutAttributes() {
        return new Car(null);
    }
}
