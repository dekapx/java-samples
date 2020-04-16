package com.dekapx.java.basics;

import com.google.common.collect.Lists;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        final List<Integer> list = Lists.newArrayList(1, 2, 3, 4, 5);
        System.out.println(list.remove(1));
    }
}
