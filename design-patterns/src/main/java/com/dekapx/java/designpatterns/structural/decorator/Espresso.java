package com.dekapx.java.designpatterns.structural.decorator;

public class Espresso extends Beverage {
    Espresso() {
        this.description = "Espresso";
    }

    @Override
    public double cost() {
        return 5.7;
    }
}
