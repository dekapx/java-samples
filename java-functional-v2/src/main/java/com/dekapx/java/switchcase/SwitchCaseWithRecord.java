package com.dekapx.java.switchcase;

record Person(String name, int age) {}

public class SwitchCaseWithRecord {
    static void main() {
        Person person = getPerson();
        switch (person) {
            case Person(var name, var age) -> System.out.println(name + " is " + age);
            default -> System.out.println("Unknown type");
        }
    }

    private static Person getPerson() {
        return new Person("John", 30);
    }
}
