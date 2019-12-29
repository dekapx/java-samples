package com.dekapx.java.model;

import java.util.Optional;

public class Dummy {
    private String state;

    public Dummy() {

    }

    public Dummy(String state) {
        this.state = state;
    }

    public String getState() {
        final Optional<String> stateOptional = Optional.ofNullable(state);
        return stateOptional.orElse("No State...");
    }
}
