package com.dekapx.java.designpatterns.structural.decorator;

public class DarkRoast extends Beverage {
    DarkRoast() {
        this.description = "Dark Roast";
    }

    public double cost() {
        return 5.6;
    }
}
