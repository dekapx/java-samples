package com.dekapx.java.basics;

import lombok.Getter;
import lombok.Setter;

import java.util.Optional;

@Getter
@Setter
class Car {
    private Engine engine;
}

@Getter
@Setter
class Engine {
    private String capacity;
}

public class Test {
    public static void main(String[] args) {
        Car car = buildCar();
        Optional.ofNullable(car)
                .map(c -> c.getEngine())
                .map(c -> car.getEngine().getCapacity())
                .ifPresent(c -> System.out.println(c));
    }

    private static Car buildCar() {
        Car car = new Car();
        Engine engine = new Engine();
        engine.setCapacity("1995 CC");
        car.setEngine(engine);
        return car;
    }
}
