package com.dekapx.java.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

record LanguageModel(String languageName) {}

public class SplitStringStreamDemo {
    public static void main(String[] args) {
        final String tokens = "Java, Scala, Java, Python, Kotlin, Ruby, Python, Scala";

        List<LanguageModel> languages = Arrays.stream(tokens.split(","))
                .map(o -> o.trim())
                .distinct()
                .sorted()
                .map(LanguageModel::new)
                .collect(Collectors.toUnmodifiableList());

        languages.forEach(model -> System.out.println(model.languageName()));
    }
}
