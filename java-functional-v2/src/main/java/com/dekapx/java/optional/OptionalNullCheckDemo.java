package com.dekapx.java.optional;

import lombok.Builder;
import lombok.Getter;

import java.util.Optional;

@Getter
@Builder
class Student {
    String name;
    String subject;
    int marks;
}

public class OptionalNullCheckDemo {
    static void main() {
        Student student = getStudent();
        String name = Optional.ofNullable(student)
                .map(Student::getName)
                .orElse("Unknown");
        System.out.println("Name: " + name);
    }

    private  static Student getStudent() {
        return Student.builder()
                .name("John Doe")
                .subject("Maths")
                .marks(85)
                .build();
    }
}
