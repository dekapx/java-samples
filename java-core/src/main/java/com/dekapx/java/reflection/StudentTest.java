package com.dekapx.java.reflection;

import com.dekapx.java.model.Student;

import java.lang.reflect.Field;

public class StudentTest {
    public static void main(String[] args) throws Exception {
        Student student = new Student("De", "Kapx");
        String fieldValue = getFieldValue(student, String.class, "lastName");
        System.out.println(fieldValue);
        System.out.println(Student.class.getTypeName());
    }

    public static <T, R> R getFieldValue(final T type, final Class<R> clazz, final String fieldName) throws Exception {
        final Field field = type.getClass().getDeclaredField(fieldName);
        field.setAccessible(true);
        return (R) field.get(type);
    }
}
