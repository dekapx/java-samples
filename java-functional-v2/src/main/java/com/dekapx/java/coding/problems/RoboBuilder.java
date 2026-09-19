package com.dekapx.java.coding.problems;

import org.jspecify.annotations.NonNull;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * get_robots(all_parts, required_parts_1) => ["Optimus", "Rosie"]
 * get_robots(all_parts, required_parts_2) => ["Rosie"]
 * get_robots(all_parts, required_parts_3) => []
 */
public class RoboBuilder {
    private static String[] all_parts = {
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
            "Optimus_sensors" };
    private static String required_parts_1 = "sensors,case,speaker,wheels";
    private static String required_parts_2 = "sensors,case,speaker,wheels,claw";
    private static String required_parts_3 = "sensors,case,screws";
    private static final String UNDERSCORE = "_";


    static void main() {
        List<String> robots1 = get_robots(all_parts, required_parts_1);
        System.out.println(robots1);

        List<String> robots2 = get_robots(all_parts, required_parts_2);
        System.out.println(robots2);

        List<String> robots3 = get_robots(all_parts, required_parts_3);
        System.out.println(robots3);
    }

    public static List<String> get_robots(String[] allParts, String requiredParts) {
        Map<String, Set<String>> robotParts = new HashMap<>();

        for (String part : allParts) {
            String robotName = part.split(UNDERSCORE)[0];
            String partName = part.split(UNDERSCORE)[1];

            robotParts.computeIfAbsent(robotName, k -> new HashSet<>()).add(partName);
        }

        Set<String> requiredPartsSet = getRequiredPartsSet(requiredParts);
        List<String> robots = new ArrayList<>();
        robotParts.forEach((robotName, parts) -> {
            if (parts.containsAll(requiredPartsSet)) {
                robots.add(robotName);
            }
        });

        return robots;
    }

    private static @NonNull Set<String> getRequiredPartsSet(String requiredParts) {
        return Arrays
                .stream(requiredParts.split(","))
                .collect(Collectors.toSet());
    }
}
