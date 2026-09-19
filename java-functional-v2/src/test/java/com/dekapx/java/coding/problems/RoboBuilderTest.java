package com.dekapx.java.coding.problems;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RoboBuilderTest {

    @BeforeEach
    public void setup() {
    }

    @Test
    public void givenPartsShouldReturnRobots() {
        String[] allParts = {
                "Rosie_claw",
                "Rosie_sensors",
                "Dustie_case",
                "Optimus_sensors",
                "Rust_sensors",
                "Rosie_case",
                "Rust_case",
                "Optimus_speaker",
                "Rosie_wheels",
                "Rosie_speaker",
                "Dustie_case",
                "Dustie_arms",
                "Rust_claw",
                "Dustie_case",
                "Dustie_speaker",
                "Optimus_case",
                "Optimus_wheels",
                "Rust_legs",
                "Optimus_sensors"
        };
        String requiredParts1 = "sensors,case,speaker,wheels";
        String requiredParts2 = "sensors,case,speaker,wheels,claw";
        String requiredParts3 = "sensors,case,screws";

        assertThat(RoboBuilder.get_robots(allParts, requiredParts1))
                .containsExactlyInAnyOrder("Optimus", "Rosie");

        assertThat(RoboBuilder.get_robots(allParts, requiredParts2))
                .containsExactlyInAnyOrder("Rosie");

        assertThat(RoboBuilder.get_robots(allParts, requiredParts3)).isEmpty();
    }
}
