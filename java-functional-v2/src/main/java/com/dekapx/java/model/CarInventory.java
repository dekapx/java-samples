package com.dekapx.java.model;

import java.util.List;

public class CarInventory {
    public static List<Car> getCars() {
        return List.of(
                Car.builder().make("Toyota").model("Camry").year(2020).fuelType(FuelType.PETROL).build(),
                Car.builder().make("Honda").model("Civic").year(2019).fuelType(FuelType.DIESEL).build(),
                Car.builder().make("Tesla").model("Model 3").year(2021).fuelType(FuelType.ELECTRIC).build(),
                Car.builder().make("Ford").model("Fusion Hybrid").year(2018).fuelType(FuelType.HYBRID).build(),
                Car.builder().make("Chevrolet").model("Malibu").year(2020).fuelType(FuelType.PETROL).build(),
                Car.builder().make("Nissan").model("Altima").year(2019).fuelType(FuelType.DIESEL).build(),
                Car.builder().make("BMW").model("i3").year(2021).fuelType(FuelType.ELECTRIC).build(),
                Car.builder().make("Hyundai").model("Sonata Hybrid").year(2018).fuelType(FuelType.HYBRID).build(),
                Car.builder().make("Volkswagen").model("Passat").year(2020).fuelType(FuelType.PETROL).build(),
                Car.builder().make("Audi").model("A4").year(2019).fuelType(FuelType.DIESEL).build(),
                Car.builder().make("Jaguar").model("I-PACE").year(2021).fuelType(FuelType.ELECTRIC).build(),
                Car.builder().make("Kia").model("Niro Hybrid").year(2018).fuelType(FuelType.HYBRID).build()
        );
    }
}
