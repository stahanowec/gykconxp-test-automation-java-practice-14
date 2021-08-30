package com.epam.test.automation.java.practice14.middle;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task7 {

    private Task7() {
    }

    public static List<Integer> getSortedDifferenceBetweenSubsets(int number, List<Integer> integerList) {

        Stream<Integer> skipElements = integerList.stream().skip(number);
        Stream<Integer> list = integerList.stream().filter(f -> f % 2 == 0);

        return Stream.concat(skipElements, list).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream().filter(f -> f.getValue() == 1)
                .map(Map.Entry::getKey).sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
    }
}