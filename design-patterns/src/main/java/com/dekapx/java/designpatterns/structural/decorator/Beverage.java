package com.dekapx.java.designpatterns.structural.decorator;

public abstract class Beverage {
    String description = "Beverage";

    String getDescription() {
        return description;
    }

    public abstract double cost();
}
