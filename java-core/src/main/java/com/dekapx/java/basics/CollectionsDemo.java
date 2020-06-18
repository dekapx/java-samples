package com.dekapx.java.basics;

import com.dekapx.java.model.Language;
import com.dekapx.java.model.LanguageHelper;
import com.dekapx.java.model.LanguageType;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static com.dekapx.java.model.LanguageType.FUNCTIONAL;
import static com.dekapx.java.model.LanguageType.OBJECT_ORIENTED;
import static com.dekapx.java.model.LanguageType.SCRIPTING;
import static com.dekapx.java.model.LanguageType.UNKNOWN_TYPE;
import static java.util.Comparator.comparing;

public class CollectionsDemo {
    public static void main(String[] args) {
        List<Language> languages = getLanguagesByType(FUNCTIONAL);
        languages.forEach(language -> System.out.println(language.getName() + " - " + language.getType()));
    }

    private static List<Language> getLanguagesByType(LanguageType... languageTypes) {
        List<Predicate<Language>> allPredicates = allPredicates(languageTypes);
        return LanguageHelper.getLanguages().stream()
                .filter(allPredicates.stream().reduce(Predicate::or).orElse(t -> true))
                .distinct()
                .sorted(comparing(Language::getName))
                .collect(Collectors.toList());
    }

    private static Predicate<Language> filterByLanguageTypePredicate(LanguageType languageType) {
        return language -> language.getType().equals(languageType);
    }

    private static List<Predicate<Language>> allPredicates(LanguageType... languageTypes) {
        List<Predicate<Language>> predicates = new ArrayList<>();
        Arrays.stream(languageTypes).forEach(type -> {
            predicates.add(filterByLanguageTypePredicate(type));
        });
        return predicates;
    }
}
