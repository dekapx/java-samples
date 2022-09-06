package com.dekapx.java.predicate;

import com.dekapx.java.model.Car;
import com.dekapx.java.model.Color;

import java.util.List;
import java.util.function.BiPredicate;
import java.util.stream.Collectors;

import static com.dekapx.java.model.Color.BLACK;
import static com.dekapx.java.model.Color.BLUE;
import static com.dekapx.java.model.Color.RED;

public class PredicateDemo {
    private static BiPredicate<Car, Color> colorPredicate = (o1, o2) -> o1.color().equals(o2);

    public static void main(String[] args) {
        List<Car> cars = getCars();
        cars
                .stream()
                .filter(c -> colorPredicate.test(c, BLUE))
                .collect(Collectors.toList())
                .forEach(c -> System.out.println(c.brand() + " " + c.model()));
    }

    private static List<Car> getCars() {
        return List.of(
                new Car("BMW", "316d", "Saloon", RED, 2021),
                new Car("BMW", "520d", "Saloon", BLUE, 2022),
                new Car("BMW", "420d", "Coupe", BLACK, 2020));
    }
}
