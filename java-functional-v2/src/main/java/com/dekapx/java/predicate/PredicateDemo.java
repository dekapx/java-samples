package com.dekapx.java.predicate;

import com.dekapx.java.model.Car;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static com.dekapx.java.model.BodyType.SALOON;
import static com.dekapx.java.model.BodyType.SUV;
import static com.dekapx.java.model.FuelType.DIESEL;
import static com.dekapx.java.model.FuelType.ELECTRIC;
import static com.dekapx.java.model.FuelType.HYBRID;

public class PredicateDemo {
    private static Predicate<Car> bodyTypeSaloonPredicate = (car) ->
            car.bodyType().equals(SALOON);
    private static Predicate<Car> fuelTypeElectricPredicate = (car) ->
            car.fuelType().equals(ELECTRIC);

    public static void main(String[] args) {
        List<Car> inventory = getInventory();
        List<Car> electricSaloons = inventory
                .stream()
                .filter(bodyTypeSaloonPredicate.and(fuelTypeElectricPredicate))
                .collect(Collectors.toList());

        electricSaloons.forEach(displayCar);
    }

    private static Consumer<Car> displayCar = (car) ->
            System.out.println(car);


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
