package com.dekapx.java.optional;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import java.util.Optional;
import java.util.function.Predicate;

@Builder
@Getter
@AllArgsConstructor
class Car {
    String name;
    String model;
    Engine engine;
}

@Builder
@Getter
@AllArgsConstructor
class Engine {
    String type;
    double capacity;
}

public class OptionalNullCheckBooleanValue {
    private static final Predicate<Double> IS_HEAVY_ENGINE = capacity
            -> capacity > 3.0;

    public static void main(String[] args) {
        System.out.println("Is the car heavy? " + isHeavyCar(buildCarWithHeavyEngine()));
        System.out.println("Is the car heavy? " + isHeavyCar(buildCarWithLightEngine()));
        System.out.println("Is the car heavy? " + isHeavyCar(null));
    }

    private static boolean isHeavyCar(Car car) {
        return Optional.ofNullable(car)
                .map(Car::getEngine)
                .map(Engine::getCapacity)
                .filter(IS_HEAVY_ENGINE)
                .isPresent();
    }

    private static Car buildCarWithHeavyEngine() {
        return Car.builder()
                .name("Toyota")
                .model("Camry")
                .engine(Engine.builder()
                        .type("V6")
                        .capacity(3.5)
                        .build())
                .build();
    }

    private static Car buildCarWithLightEngine() {
        return Car.builder()
                .name("Toyota")
                .model("Yaris")
                .engine(Engine.builder()
                        .type("V6")
                        .capacity(1.6)
                        .build())
                .build();
    }

}
