package com.dekapx.java.optional;

import com.dekapx.java.model.Car;
import com.dekapx.java.model.Engine;

import java.util.Optional;

public class OptionalDemo {
    public static void main(String[] args) {
        final String capacity = Optional.ofNullable(getCarWithArrtibutes())
                .map(Car::getEngine)
                .map(Engine::getCapacity)
                .orElseThrow(() -> new IllegalArgumentException("Must not be null or empty."));

        System.out.println("Engine Capacity: " + capacity);
    }

    private static Car getCarWithArrtibutes() {
        return new Car(new Engine("1995 CC"));
    }

    private static Car getCarWithoutArrtibutes() {
        return new Car(null);
    }

}
