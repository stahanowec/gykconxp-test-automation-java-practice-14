package com.epam.test.automation.java.practice14.middle;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task8 {

    private Task8() {
    }

    public static List<Integer> getSortedUnionTwoSubsetsIntegers(int d, int k, List<Integer> intList) {
        Stream<Integer> integerStream = intList.stream().filter(f -> f > d);
        Stream<Integer> skip = intList.stream().skip(k + 1L);
        return Stream.concat(integerStream, skip)
                .collect(Collectors.toSet())
                .stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
    }
}
