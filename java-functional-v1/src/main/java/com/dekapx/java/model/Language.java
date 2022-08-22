package com.dekapx.java.model;

public enum Language {
    JAVA("Java"), KOTLIN ("Kotlin"), SCALA("Scala"), HASKELL("Haskell"), PYTHON("Python");

    private String language;

    Language(String language) {
        this.language = language;
    }

    public String toString() {
        return this.language;
    }
}
