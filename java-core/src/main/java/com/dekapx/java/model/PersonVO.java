package com.dekapx.java.model;

public class PersonVO {
    private String firstName;
    private String lastName;
    private String email;

    public PersonVO() {
    }

    public PersonVO(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "PersonVO {" +
                "firstName =' " + firstName + '\'' +
                ", lastName = '" + lastName + '\'' +
                ", email = '" + email + '\'' +
                '}';
    }
}
