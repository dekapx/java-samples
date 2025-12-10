package com.dekapx.java.utils;

import java.util.Optional;

public class BeanUtils {
    public static <T> T createInstance(Class<T> clazz) {
        Class<T> checkedClazz = Optional.ofNullable(clazz)
                .orElseThrow(() -> new IllegalArgumentException("Class type cannot be null..."));
        try {
            return checkedClazz.getDeclaredConstructor().newInstance();
        } catch (ReflectiveOperationException e) {
            throw new RuntimeException("Unable to create instance...");
        }
    }
}
