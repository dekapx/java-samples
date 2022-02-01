package com.dekapx.java.newfeatures;

import com.dekapx.java.model.Student;

public class RecordDemo {
    public static void main(String[] args) {
        var student = new Student(1, "Dummy");
        showStudent(student);
    }

    private static void showStudent(Student student) {
        System.out.println(student.id() + " " + student.name());
        System.out.println();
    }
}
