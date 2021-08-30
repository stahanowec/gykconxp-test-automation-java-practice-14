package com.epam.test.automation.java.practice14.low;

import java.util.List;
import java.util.stream.Collectors;

public class Task5 {

    private Task5() {}

    public static List<String> getSortedAscOddValues(List<Integer> intList) {
        return intList.stream().filter(Task5::isOdd)
                .sorted()
                .map(String::valueOf)
                .collect(Collectors.toList());
    }

    private static boolean isOdd(Integer value) {
        return value % 2 != 0;
    }
}
