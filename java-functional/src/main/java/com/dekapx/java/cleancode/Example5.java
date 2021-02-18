package com.dekapx.java.cleancode;

import java.util.List;
import java.util.stream.Collectors;

import static com.dekapx.java.cleancode.CarInventory.getInventory;
import static com.dekapx.java.cleancode.CarPredicates.brandPredicate;
import static com.dekapx.java.cleancode.CarPredicates.fuelTypePredicate;
import static com.dekapx.java.cleancode.CarPredicates.transmissionPredicate;
import static com.dekapx.java.cleancode.FuelType.Diesel;
import static com.dekapx.java.cleancode.FuelType.Electric;
import static com.dekapx.java.cleancode.Transmission.Automatic;

public class Example5 {


    public static void main(String[] args) {
        List<Car> inventory = getInventory();
        System.out.println(findCar(inventory, "Mercedes"));
        System.out.println(findCar(inventory, "BMW", Diesel));
        System.out.println(findCar(inventory, "Audi", Electric, Automatic));
    }

    private static List<Car> findCar(List<Car> inventory, String brand) {
        return inventory.stream()
                .filter(brandPredicate(brand))
                .collect(Collectors.toList());
    }

    private static List<Car> findCar(List<Car> inventory, String brand, FuelType fuelType) {
        return inventory.stream()
                .filter(brandPredicate(brand)
                        .and(fuelTypePredicate(fuelType)))
                .collect(Collectors.toList());
    }

    private static List<Car> findCar(List<Car> inventory, String brand, FuelType fuelType, Transmission transmission) {
        return inventory.stream()
                .filter(brandPredicate(brand)
                        .and(fuelTypePredicate(fuelType))
                        .and(transmissionPredicate(transmission)))
                .collect(Collectors.toList());
    }
}
