package com.dekapx.java.predicates;

import com.dekapx.java.model.LanguageModel;
import com.dekapx.java.model.LanguageType;

import java.util.List;
import java.util.function.BiPredicate;
import java.util.stream.Collectors;

import static com.dekapx.java.model.LanguageType.FUNCTIONAL;
import static com.dekapx.java.model.LanguageType.OBJECT_ORIENTED;
import static com.dekapx.java.model.LanguageType.SCRIPTING;

public class BiPredicateDemo {
    private static BiPredicate<LanguageModel, LanguageType> predicate = (model, type) ->
            model.type().equals(type);

    public static void main(String[] args) {
        List<LanguageModel> models = filterLanguages(getModels());
        models.forEach(model -> System.out.println(model.name()));
    }

    private static List<LanguageModel> filterLanguages(List<LanguageModel> models) {
        return models
                .stream()
                .filter(model -> predicate.test(model, FUNCTIONAL))
                .collect(Collectors.toUnmodifiableList());
    }

    private static List<LanguageModel> getModels() {
        return List.of(
                new LanguageModel("Java", FUNCTIONAL),
                new LanguageModel("Scala", FUNCTIONAL),
                new LanguageModel("Python", SCRIPTING),
                new LanguageModel("C++", OBJECT_ORIENTED));
    }
}
