package com.dekapx.java.model;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class Address {
    private String addressLine;
    private String city;
    private String county;
}
