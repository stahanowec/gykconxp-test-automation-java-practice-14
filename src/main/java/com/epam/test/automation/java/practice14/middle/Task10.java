package com.epam.test.automation.java.practice14.middle;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Task10 {

    private Task10() {
    }

    public static List<String> getSortedLastLettersInUpperCase(List<String> stringList) {
        return stringList.stream().collect(Collectors.toMap(Function.identity(), String::length))
                .entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .map(u -> u.getKey().substring(u.getKey().length() - 1))
                .map(String::toUpperCase)
                .collect(Collectors.toList());
    }
}