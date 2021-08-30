package com.epam.test.automation.java.practice14.low;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Task1 {

    private Task1() {}

    public static List<String> filterByFirstAndLastCharacter(char symbol, List<String> stringList) {
        return stringList.stream()
                .filter(Task1::filterString)
                .filter(validate(symbol))
                .collect(Collectors.toList());
    }

    private static boolean filterString(String str) {
        return str.length() > 1;
    }

    private static Predicate<String> validate(char symbol) {
        return str -> {
            char first = str.charAt(0);
            char last = str.charAt(str.length() - 1);
            return first == symbol && last == symbol;
        };
    }
}
