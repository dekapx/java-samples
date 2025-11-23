package com.dekapx.java.utils;

public class BeanUtils {
    public static <T> T createInstance(Class<T> clazz) {
        try {
            return clazz.getDeclaredConstructor().newInstance();
        } catch (Exception e) {
            throw new RuntimeException("Unable to create instance...");
        }
    }
}
