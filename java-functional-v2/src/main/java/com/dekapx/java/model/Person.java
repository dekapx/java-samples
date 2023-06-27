package com.dekapx.java.model;

import java.util.Optional;

public record Person(
        String firstName,
        String lastName,
        Optional<Car> carOptional) {
}
