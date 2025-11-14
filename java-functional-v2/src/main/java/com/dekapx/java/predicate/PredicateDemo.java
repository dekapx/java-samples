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

    static void main() {
        List<String> cars = filterCars(fuelTypePredicate(FuelType.ELECTRIC));
        cars.forEach(System.out::println);
    }

    private static List<String> filterCars(Predicate<Car> predicate) {
        List<Car> cars = CarInventory.getCars();

        return cars.stream()
                .filter(predicate)
                .map(car -> car.getMake() + " " + car.getModel())
                .collect(Collectors.toList());
    }
}
