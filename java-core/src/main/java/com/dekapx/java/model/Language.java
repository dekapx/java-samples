package com.dekapx.java.model;

import com.google.common.base.Objects;

import java.util.Optional;

public class Language implements Comparable<Language> {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Language language = (Language) o;
        return Objects.equal(name, language.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }

    @Override
    public int compareTo(Language other) {
        return this.getName().compareTo(other.getName());
    }
}
