package com.dekapx.java.generics;

import java.lang.reflect.Type;
import java.util.List;

public class TypeReferenceDemo {
    public static void main(String[] args) {
        TypeReference<List<String>> typeReference = new TypeReference<List<String>>() {
            @Override
            public Type getType() {
                return super.getType();
            }
        };
        System.out.println(typeReference.getType());
    }
}
