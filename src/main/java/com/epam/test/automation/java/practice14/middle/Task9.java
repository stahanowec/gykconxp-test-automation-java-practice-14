package com.epam.test.automation.java.practice14.middle;

import java.util.List;
import java.util.stream.Collectors;

public class Task9 {

    private Task9() {
    }

    public static List<String> shouldReturnStringListWithLengthAndFirstLetter(List<String> stringList) {

        return stringList.stream()
                .collect(Collectors.groupingBy(x -> String.valueOf(x.charAt(0))))
                .entrySet()
                .stream()
                .map(u -> fromValue(u.getValue()) + "-" + u.getKey())
                .collect(Collectors.toList());
    }

    private static Integer fromValue(List<String> value) {
        return value.stream().map(String::length).reduce(0, Integer::sum);
    }
}
