package com.dekapx.java.collections;

import java.util.Map;
import java.util.Set;

public class LazyMapDemo {
    void main() {
        Set<String> languages = Set.of("Java", "Python", "JavaScript");
        Map<String, Boolean> map = Map.ofLazy(
                languages,
                language -> language.length() > 4
        );
        System.out.println(map);
    }
}
