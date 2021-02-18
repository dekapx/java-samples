package com.dekapx.java.cleancode;

import java.util.List;

public class CarInventory {
    public static List<Car> getInventory() {
        return List.of(
                Car.builder()
                        .brand("BMW")
                        .model("320d")
                        .year(2021)
                        .fuelType(FuelType.Petrol)
                        .transmission(Transmission.Manual)
                        .build(),
                Car.builder()
                        .brand("BMW")
                        .model("520d")
                        .year(2020)
                        .fuelType(FuelType.Diesel)
                        .transmission(Transmission.Automatic)
                        .build(),
                Car.builder()
                        .brand("BMW")
                        .model("530e")
                        .year(2021)
                        .fuelType(FuelType.Hybrid)
                        .transmission(Transmission.Automatic)
                        .build(),
                Car.builder()
                        .brand("Audi")
                        .model("A5")
                        .year(2020)
                        .fuelType(FuelType.Diesel)
                        .transmission(Transmission.Automatic)
                        .build(),
                Car.builder()
                        .brand("Audi")
                        .model("eTron")
                        .year(2020)
                        .fuelType(FuelType.Electric)
                        .transmission(Transmission.Automatic)
                        .build(),
                Car.builder()
                        .brand("Audi")
                        .model("A6")
                        .year(2020)
                        .fuelType(FuelType.Petrol)
                        .transmission(Transmission.Manual)
                        .build(),
                Car.builder()
                        .brand("Mercedes")
                        .model("E63")
                        .year(2021)
                        .fuelType(FuelType.Petrol)
                        .transmission(Transmission.Automatic)
                        .build()
        );
    }
}
