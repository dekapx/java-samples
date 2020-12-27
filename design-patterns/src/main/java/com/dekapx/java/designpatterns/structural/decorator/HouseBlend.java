package com.dekapx.java.designpatterns.structural.decorator;

public class HouseBlend extends Beverage {
    HouseBlend() {
        this.description = "House Blend Coffee";
    }

    @Override
    public double cost() {
        return 3.8;
    }
}
