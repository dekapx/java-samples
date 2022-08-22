package com.dekapx.java.basics;

import com.dekapx.java.model.Language;
import com.dekapx.java.model.LanguageType;

import static com.dekapx.java.model.Language.JAVA;
import static com.dekapx.java.model.Language.KOTLIN;
import static com.dekapx.java.model.Language.PYTHON;
import static com.dekapx.java.model.Language.SCALA;
import static com.dekapx.java.model.LanguageType.FUNCTIONAL;
import static com.dekapx.java.model.LanguageType.OBJECT_ORIENTED;
import static com.dekapx.java.model.LanguageType.SCRIPTING;

public class SwitchExpressionDemo {
    public static void main(String[] args) {
        System.out.println(getLanguageType(JAVA));
        System.out.println(getLanguageType(SCALA));
        System.out.println(getLanguageType(PYTHON));
        System.out.println(getLanguageType(KOTLIN));
    }

    private static LanguageType getLanguageType(Language language) {
        LanguageType languageType = switch (language) {
            case JAVA -> OBJECT_ORIENTED;
            case SCALA, HASKELL -> FUNCTIONAL;
            case PYTHON -> SCRIPTING;
            default -> {
                throw new IllegalStateException("Unexpected value: " + language);
            }
        };
        return languageType;
    }
}
