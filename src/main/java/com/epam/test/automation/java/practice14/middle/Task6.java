package com.epam.test.automation.java.practice14.middle;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Task6 {

    private Task6() {
    }

    private static final String NOT_FOUND = "Not Found";

    public static List<String> shouldReturnStringWithFirstLetterDigitAndLengthEqualsNumber
            (List<Integer> numbers, List<String> stringList) {
        Map<Integer, List<String>> listMap = stringList.stream()
                .collect(Collectors.groupingBy(String::length));
        return numbers.stream()
                .map(listMap::get)
                .map(Task6::fromList)
                .collect(Collectors.toList());
    }

    private static String fromList(List<String> list) {
        if (null == list) {
            return NOT_FOUND;
        }
        return list.get(0);
    }
}
