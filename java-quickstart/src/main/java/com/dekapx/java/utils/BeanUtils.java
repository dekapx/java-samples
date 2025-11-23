package com.dekapx.java.utils;

import lombok.experimental.UtilityClass;

import java.beans.Introspector;

@UtilityClass
public class BeanUtils {
    /**
     * Generate Spring bean name for the given class type, can be used for bean lookup purpose.
     *
     * @param clazz Class type
     * @return Spring bean name
     */
    public static String generateBeanName(Class clazz) {
        return Introspector.decapitalize(clazz.getSimpleName());
    }
}
