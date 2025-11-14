package com.dekapx.java.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
@AllArgsConstructor
public class Car {
    private String make;
    private String model;
    private int year;
    private FuelType fuelType;
}
