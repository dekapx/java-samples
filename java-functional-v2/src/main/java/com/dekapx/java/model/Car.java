package com.dekapx.java.model;

public record Car(
        String brand,
        String model,
        BodyType bodyType,
        FuelType fuelType) {
}
