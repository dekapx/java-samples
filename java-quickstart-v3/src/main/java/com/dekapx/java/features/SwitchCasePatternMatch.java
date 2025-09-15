package com.dekapx.java.features;

enum NotificationType {
    EMAIL;
}

public class SwitchCasePatternMatch {
    public static void main(String[] args) {
        performMatch(NotificationType.EMAIL);
        performMatch(7);
        performMatch(3);
        performMatch("Hello Java");
        performMatch(10L);
    }

    private static void performMatch(Object o) {
        String output = switch (o) {
            case NotificationType.EMAIL -> "Enum: Email Notification";
            case Integer i when i > 5 -> String.format("Number greater than 5: %d", i);
            case Integer i -> String.format("This is an Integer: %d", i);
            case Long l -> String.format("This is a Long: %d", l);
            case String str -> String.format("Sample String [%s]", str);
            default -> "No Match";
        };
        System.out.println(output);
    }
}
