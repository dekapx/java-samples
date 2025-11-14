package com.dekapx.java.predicate;

import com.dekapx.java.model.Car;
import com.dekapx.java.model.CarInventory;
import com.dekapx.java.model.FuelType;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateDemo {
    private static Predicate<Car> fuelTypePredicate(FuelType fuelType) {
        return car -> car.getFuelType().equals(fuelType);
    }

    private static Predicate<Car> colorPredicate(String color) {
        return car -> car.getColor().equalsIgnoreCase(color);
    }

    static void main() {
        List<String> cars = filterCars();
        cars.forEach(System.out::println);
    }

    private static List<String> filterCars() {
        List<Car> cars = CarInventory.getCars();

        return cars.stream()
                .filter(fuelTypePredicate(FuelType.ELECTRIC).and(colorPredicate("Red")))
                .map(car -> car.getMake() + " " + car.getModel())
                .collect(Collectors.toList());
    }
}
