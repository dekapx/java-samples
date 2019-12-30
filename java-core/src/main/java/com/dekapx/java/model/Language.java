package com.dekapx.java.model;

import java.util.Optional;

public class Language {
    private String name;
    private LanguageType type;

    public Language() {
    }

    public Language(String name) {
        this.name = name;
    }

    public Language(String name, LanguageType type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public LanguageType getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Language{" +
                "name='" + name + '\'' +
                ", type=" + Optional.ofNullable(type).orElse(LanguageType.UNKNOWN_TYPE) +
                '}';
    }
}
