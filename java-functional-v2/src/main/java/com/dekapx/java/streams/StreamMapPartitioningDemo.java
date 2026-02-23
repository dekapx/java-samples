package com.dekapx.java.streams;

import com.dekapx.java.model.Car;
import com.dekapx.java.model.CarInventory;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static com.dekapx.java.model.FuelType.ELECTRIC;

public class StreamMapPartitioningDemo {
    static void main() {
        List<Car> cars = CarInventory.getCars();
        Map<Boolean, List<String>> partitionedCars = cars.stream()
                .collect(Collectors.partitioningBy(car -> car.getFuelType() == ELECTRIC,
                        Collectors.mapping(Car::getMake, Collectors.toList())));
        System.out.println(partitionedCars);
    }
}
