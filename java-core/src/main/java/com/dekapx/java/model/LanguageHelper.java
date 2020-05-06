package com.dekapx.java.model;

import java.util.ArrayList;
import java.util.List;

import static com.dekapx.java.model.LanguageType.FUNCTIONAL;
import static com.dekapx.java.model.LanguageType.OBJECT_ORIENTED;
import static com.dekapx.java.model.LanguageType.SCRIPTING;
import static com.dekapx.java.model.LanguageType.UNKNOWN_TYPE;

public class LanguageHelper {
    public static List<Language> getLanguages() {
        final List<Language> languages = new ArrayList<>();
        languages.add(new Language("Java", FUNCTIONAL));
        languages.add(new Language("Scala", FUNCTIONAL));
        languages.add(new Language("JavaScript", SCRIPTING));
        languages.add(new Language("Kotlin", FUNCTIONAL));
        languages.add(new Language("C++", OBJECT_ORIENTED));
        languages.add(new Language("Python", SCRIPTING));
        languages.add(new Language("ADA", OBJECT_ORIENTED));
        languages.add(new Language("ADA", UNKNOWN_TYPE));
        languages.add(new Language("Java", FUNCTIONAL));
        return languages;
    }
}
