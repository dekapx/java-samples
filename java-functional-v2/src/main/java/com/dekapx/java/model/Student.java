package com.dekapx.java.model;

import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Getter
@Builder
public class Student {
    private String firstName;
    private String lastName;
    private List<Address> addresses;
}
