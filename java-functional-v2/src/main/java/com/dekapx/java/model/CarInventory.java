package com.dekapx.java.model;

import java.util.List;

public class CarInventory {
    public static List<Car> getCars() {
        // build car inventory based on FuelType
        return List.of(
                Car.builder().make("Tesla").model("Model S").fuelType(FuelType.ELECTRIC).color("Red").mileage(0).year(2022).build(),
                Car.builder().make("Nissan").model("Leaf").fuelType(FuelType.ELECTRIC).color("Blue").mileage(15000).year(2021).build(),
                Car.builder().make("Ford").model("F-150").fuelType(FuelType.DIESEL).color("Black").mileage(30000).year(2020).build(),
                Car.builder().make("Chevrolet").model("Bolt").fuelType(FuelType.ELECTRIC).color("White").mileage(5000).year(2023).build(),
                Car.builder().make("Toyota").model("Camry").fuelType(FuelType.HYBRID).color("Silver").mileage(25000).year(2019).build(),
                Car.builder().make("Honda").model("Civic").fuelType(FuelType.PETROL).color("Gray").mileage(40000).year(2018).build(),
                Car.builder().make("BMW").model("i3").fuelType(FuelType.ELECTRIC).color("Green").mileage(10000).year(2021).build(),
                Car.builder().make("Audi").model("A3 e-tron").fuelType(FuelType.HYBRID).color("Blue").mileage(20000).year(2020).build(),
                Car.builder().make("Volkswagen").model("e-Golf").fuelType(FuelType.ELECTRIC).color("Red").mileage(8000).year(2022).build(),
                Car.builder().make("Hyundai").model("Ioniq").fuelType(FuelType.HYBRID).color("White").mileage(12000).year(2021).build()
        );
    }
}
