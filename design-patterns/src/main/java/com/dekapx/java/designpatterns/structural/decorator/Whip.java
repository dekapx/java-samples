package com.dekapx.java.designpatterns.structural.decorator;

public class Whip extends CondimentDecorator {
    private Beverage beverage;

    Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.75D;
    }
}
