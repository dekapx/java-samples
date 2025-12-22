package com.dekapx.java.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
@AllArgsConstructor
public class Address {
    private String houseNo;
    private String street;
    private String city;
    private String state;
    private String zipCode;
}
