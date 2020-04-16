package com.dekapx.java.validator;

public class CustomValidatorTest {
    public static void main(String[] args) throws Exception  {
        final Student student = new Student(1L, "Test", 25);
        final CustomValidator customValidator = new CustomValidator();
        boolean isValid = customValidator.isValidObject(student);
    }
}
