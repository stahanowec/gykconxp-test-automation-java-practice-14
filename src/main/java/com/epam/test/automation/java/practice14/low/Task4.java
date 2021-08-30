package com.epam.test.automation.java.practice14.low;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Task4 {

    private Task4() {}

    public static List<String> filterAndSortByLastDigit(int number, List<String> stringList) {
        return stringList.stream()
                .filter(filterString(number))
                .filter(Task4::validator)
                .sorted()
                .collect(Collectors.toList());
    }

    private static Predicate<String> filterString(int number) {
        return str -> str.length() == number;
    }

    private static boolean validator(String str) {
        char data = str.charAt(str.length() - 1);
        return validateNumber(String.valueOf(data));
    }

    private static boolean validateNumber(String data) {
        try {
            Integer.valueOf(data);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}