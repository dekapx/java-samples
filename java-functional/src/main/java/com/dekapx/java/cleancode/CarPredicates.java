package com.dekapx.java.cleancode;

import java.util.function.Predicate;

public class CarPredicates {
    public static Predicate<Car> brandPredicate(String brand) {
        return car -> car.getBrand().equals(brand);
    }

    public static Predicate<Car> fuelTypePredicate(FuelType fuelType) {
        return car -> car.getFuelType().equals(fuelType);
    }

    public static Predicate<Car> transmissionPredicate(Transmission transmission) {
        return car -> car.getTransmission().equals(transmission);
    }
}
