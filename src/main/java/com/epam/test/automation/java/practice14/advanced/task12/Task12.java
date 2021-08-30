package com.epam.test.automation.java.practice14.advanced.task12;

import java.util.List;
import java.util.stream.Collectors;

public class Task12 {

    private Task12() {
    }

    public static List<NumberPair> makeNumberPairsFromTwoList(List<Integer> integerList1, List<Integer> integerList2) {
        return integerList1.stream().map(u -> {
            int i = u % 10;
            Integer integer = integerList2.stream().filter(f -> f % 10 == i).findFirst().orElse(0);
            return new NumberPair(u, integer);
        }).filter(f -> f.getValue2() != 0).collect(Collectors.toList());
    }
}
