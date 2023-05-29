package com.dekapx.java.predicate;

import com.dekapx.java.model.BodyType;
import com.dekapx.java.model.Car;
import com.dekapx.java.model.FuelType;

import java.util.List;
import java.util.function.BiPredicate;
import java.util.stream.Collectors;

import static com.dekapx.java.model.BodyType.SALOON;
import static com.dekapx.java.model.BodyType.SUV;
import static com.dekapx.java.model.FuelType.DIESEL;
import static com.dekapx.java.model.FuelType.ELECTRIC;
import static com.dekapx.java.model.FuelType.HYBRID;

public class BiPredicateDemo {
    private static BiPredicate<Car, BodyType> bodyTypePredicate = (car, bodyType) ->
            car.bodyType().equals(bodyType);
    private static BiPredicate<Car, FuelType> fuelTypePredicate = (car, fuelType) ->
            car.fuelType().equals(fuelType);

    public static void main(String[] args) {
        List<Car> inventory = getInventory();
        List<Car> electricSaloons = inventory
                .stream()
                .filter(car -> bodyTypePredicate.test(car, SALOON)
                        && fuelTypePredicate.test(car, ELECTRIC))
                .collect(Collectors.toList());

        electricSaloons.forEach(System.out::println);
    }

    private static List<Car> getInventory() {
        return List.of(
                new Car("BMW", "320d", SALOON, DIESEL),
                new Car("BMW", "330e", SALOON, HYBRID),
                new Car("BMW", "i5", SALOON, ELECTRIC),
                new Car("BMW", "i5", SALOON, ELECTRIC),
                new Car("BMW", "i7", SALOON, ELECTRIC),
                new Car("BMW", "X5", SUV, DIESEL),
                new Car("BMW", "X5", SUV, HYBRID)
        );
    }
}
