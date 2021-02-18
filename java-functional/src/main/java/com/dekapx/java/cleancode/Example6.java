package com.dekapx.java.cleancode;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static com.dekapx.java.cleancode.CarInventory.getInventory;
import static com.dekapx.java.cleancode.CarPredicates.brandPredicate;
import static com.dekapx.java.cleancode.CarPredicates.fuelTypePredicate;
import static com.dekapx.java.cleancode.CarPredicates.transmissionPredicate;
import static com.dekapx.java.cleancode.FuelType.Diesel;
import static com.dekapx.java.cleancode.FuelType.Electric;
import static com.dekapx.java.cleancode.Transmission.Automatic;

public class Example6 {
    public static void main(String[] args) {
        List<Car> inventory = getInventory();
        System.out.println(findByPredicates(inventory, List.of(brandPredicate("Mercedes"))));

        System.out.println(findByPredicates(inventory, List.of(
                brandPredicate("BMW"),
                fuelTypePredicate(Diesel))));

        System.out.println(findByPredicates(inventory, List.of(
                brandPredicate("Audi"),
                fuelTypePredicate(Electric),
                transmissionPredicate(Automatic))));
    }


    public static <T> List<T> findByPredicates(final List<T> elements, final List<Predicate<T>> predicates) {
        return elements.stream()
                .filter(predicates.stream()
                        .reduce(e -> true, Predicate::and))
                .collect(Collectors.toList());
    }
}
