package com.dekapx.java.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@Builder
@ToString
@AllArgsConstructor
public class Order {
    private Long orderId;
    private List<Item> items;
    private OrderStatus orderStatus;
}
