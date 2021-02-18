package com.dekapx.java.cleancode;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@ToString
@Getter
@Builder
@AllArgsConstructor
public class Car {
    private String brand;
    private String model;
    private int year;
    private FuelType fuelType;
    private Transmission transmission;
}
