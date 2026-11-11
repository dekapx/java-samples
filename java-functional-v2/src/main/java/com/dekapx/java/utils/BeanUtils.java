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

    public static <T> T createInstanceWithArgs(Class<T> clazz, Object... args) {
        Class<T> checkedClazz = Optional.ofNullable(clazz)
                .orElseThrow(() -> new IllegalArgumentException("Class type cannot be null..."));
        try {
            Class<?>[] argTypes = new Class<?>[args.length];
            for (int i = 0; i < args.length; i++) {
                argTypes[i] = args[i].getClass();
            }
            return checkedClazz.getDeclaredConstructor(argTypes).newInstance(args);
        } catch (ReflectiveOperationException e) {
            throw new RuntimeException("Unable to create instance with arguments...");
        }
    }
}
