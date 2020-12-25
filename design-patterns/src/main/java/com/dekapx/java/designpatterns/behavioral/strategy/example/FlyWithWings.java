package com.dekapx.java.designpatterns.behavioral.strategy.example;

public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("Fly with wings...");
    }
}
