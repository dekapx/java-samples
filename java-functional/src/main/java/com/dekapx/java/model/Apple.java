package com.dekapx.java.model;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Getter
@Builder
@ToString
public class Apple {
    private Color color;
    private int weight;
}
