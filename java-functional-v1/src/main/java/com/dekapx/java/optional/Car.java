package com.dekapx.java.optional;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
@AllArgsConstructor
public class Car {
    private String brand;
    private String color;
    private Engine engine;
}
