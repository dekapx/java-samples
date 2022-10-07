package com.dekapx.java.collection;

import com.dekapx.java.model.Car;

import java.util.ArrayList;
import java.util.List;

import static com.dekapx.java.model.Color.BLACK;
import static com.dekapx.java.model.Color.BLUE;
import static com.dekapx.java.model.Color.RED;

public class RemoveFromListDemo {
    public static void main(String[] args) {
        List<Car> cars = getCars();
        cars.removeIf(car -> car.model().equals("520d"));
        System.out.println(cars.size());
    }

    private static List<Car> getCars() {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("BMW", "316d", "Saloon", RED, 2021));
        cars.add(new Car("BMW", "520d", "Saloon", BLUE, 2022));
        cars.add(new Car("BMW", "420d", "Coupe", BLACK, 2020));
        return cars;
    }
}
