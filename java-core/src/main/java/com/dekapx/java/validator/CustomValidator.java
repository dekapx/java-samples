package com.dekapx.java.validator;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Objects;
import java.util.function.BiConsumer;

public class CustomValidator<T> {
    public boolean isValidObject(final T object) throws Exception {
        if (Objects.isNull(object)) {
            throw new IllegalArgumentException("Object must not be null...");
        }

        final Field[] fields = object.getClass().getDeclaredFields();
        Arrays.stream(fields).forEach(f -> biConsumer.accept(f, object));
        return false;
    }

    private BiConsumer<Field, T> biConsumer = (field, t) -> {
        try {
            field.setAccessible(true);
            final Object objectValue  = field.get(t);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    };
}


