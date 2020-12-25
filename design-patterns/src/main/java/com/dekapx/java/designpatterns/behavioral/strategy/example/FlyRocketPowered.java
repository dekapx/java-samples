package com.dekapx.java.designpatterns.behavioral.strategy.example;

public class FlyRocketPowered implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("Fly with Rocket...");
    }
}
