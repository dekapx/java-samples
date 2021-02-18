package com.dekapx.java.model;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public enum Department {
    ADMINISTRATION("Administration"),
    ENGINEERING("Engineering"),
    FINANCE("Finance"),
    HUMAN_RESOURCES("Human Resource"),
    QUALITY_ASSURANCE("Quality Assurance");

    private String value;
    private static final Map<String, Department> departments = new HashMap<>();

    static {
        Arrays.stream(Department.values()).forEach(commandType ->
                departments.put(commandType.toString(), commandType));
    }

    Department(final String value) {
        this.value = value;
    }

    public static Department getKey(final String value) {
        return departments.get(value);
    }

    @Override
    public String toString() {
        return value;
    }
}
