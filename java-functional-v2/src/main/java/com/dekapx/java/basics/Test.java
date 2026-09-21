package com.dekapx.java.basics;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

record Student(String name, String subject, int marks) {}

public class Test {
    static void main(String[] args) {
        List<Student> students = getStudents();
        Map<String, Double> averageMarksBySubject = students.stream()
                .filter(student -> student.name().equals("Alice"))
                .collect(Collectors.groupingBy(
                        Student::subject,
                        Collectors.averagingInt(Student::marks)
                ));
        System.out.println(averageMarksBySubject);
    }

    private static List<Student> getStudents() {
        return List.of(
            new Student("Alice", "Math", 85),
            new Student("Alice", "Science", 90),
            new Student("Alice", "English", 78),
            new Student("Alice", "History", 92),
            new Student("Eve", "Math", 88),
            new Student("Eve", "Science", 75),
            new Student("Eve", "English", 95),
            new Student("Eve", "History", 80),
            new Student("Ivy", "Math", 82),
            new Student("Ivy", "Science", 89),
            new Student("Ivy", "English", 91),
            new Student("Ivy", "History", 87)
        );
    }

}
