package com.dekapx.java.collections;

import java.util.concurrent.ConcurrentHashMap;

/**
 * ConcurrentHashMap with computeIfAbsent example
 */
public class ConcurrentHashMapDemo {
    private static final ConcurrentHashMap CACHE = new ConcurrentHashMap<>() {{
        put("name", "John Doe");
        put("department", "Engineering");
        put("City", "New York");
    }};

    static void main() {
        String key = "country";
        String value = (String) CACHE.computeIfAbsent(key, o -> loadFromDB((String) o));
        System.out.println("Value for key '" + key + "': " + value);
    }

    private static String loadFromDB(String key) {
        return "America";
    }
}
