package com.dekapx.java.designpatterns.structural.decorator;

public class Soy extends CondimentDecorator {
    private Beverage beverage;

    Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.10D;
    }
}
