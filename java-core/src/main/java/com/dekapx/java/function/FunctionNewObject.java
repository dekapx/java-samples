package com.dekapx.java.function;

import static com.dekapx.java.model.LanguageType.*;

import com.dekapx.java.model.Language;
import com.dekapx.java.model.LanguageType;

import java.util.AbstractMap;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FunctionNewObject {
    private static final Map<String, LanguageType> map = Stream.of(
            new AbstractMap.SimpleImmutableEntry<>("Java", OBJECT_ORIENTED),
            new AbstractMap.SimpleImmutableEntry<>("Scala", FUNCTIONAL),
            new AbstractMap.SimpleImmutableEntry<>("Python", SCRIPTING))
            .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

    private static final String[] languageTokens = {"Java", "Scala", "Python"};

    public static void main(String[] args) {
        createObjectUsingBiFunction();
    }

    private static void createObjectUsingFunction() {
        final Function<String, Language> toLanguage = (name) -> new Language(name);
        final List<Language> languages = Arrays.stream(languageTokens)
                .map(token -> toLanguage.apply(token))
                .collect(Collectors.toList());

        languages.forEach(print);
    }

    private static void createObjectUsingBiFunction() {
        final BiFunction<String, LanguageType, Language> toLanguage = (name, type) -> new Language(name, type);
        final List<Language> languages = Arrays.stream(languageTokens)
                .map(token -> toLanguage.apply(token, map.get(token)))
                .collect(Collectors.toList());

        languages.forEach(print);
    }


    private static void createObjectUsingTriFunction() {
    }

    private static Consumer<Language> print = (language)
            -> System.out.println(language);
}

