package com.epam.test.automation.java.practice14.advanced.task13;

import com.epam.test.automation.java.practice14.advanced.Entrant;
import com.epam.test.automation.java.practice14.advanced.YearSchoolStat;

import java.util.*;
import java.util.stream.Collectors;

public class Task13 {

    private Task13() {
    }

    public static List<YearSchoolStat> getYearSchoolStatList(List<Entrant> nameList, List<Integer> yearList) {

        Map<Integer, List<Entrant>> data = nameList.stream().collect(Collectors.groupingBy(Entrant::getYearOfEntering));

        return yearList.stream()
                .map(i -> {
                    List<Entrant> value = Optional.ofNullable(data.get(i)).orElse(Collections.emptyList());
                    long count = value.stream().map(Entrant::getSchoolNumber).distinct().count();
                    return new YearSchoolStat(i, Math.toIntExact(count));
                })
                .sorted(Comparator.comparing(YearSchoolStat::getNumberOfSchools)
                        .thenComparing(YearSchoolStat::getYearOfEntering))
                .collect(Collectors.toList());

    }
}