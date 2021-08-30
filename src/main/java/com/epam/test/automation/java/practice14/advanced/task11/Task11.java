package com.epam.test.automation.java.practice14.advanced.task11;

import com.epam.test.automation.java.practice14.advanced.Entrant;
import com.epam.test.automation.java.practice14.advanced.YearSchoolStat;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Task11 {

    private Task11() {
    }

    public static List<YearSchoolStat> getYearSchoolStats(List<Entrant> entrantList) {
        return entrantList.stream().collect(Collectors.groupingBy(Entrant::getYearOfEntering))
                .entrySet()
                .stream().map(Task11::fromMap)
                .sorted(Comparator.comparing(YearSchoolStat::getNumberOfSchools)
                        .thenComparing(YearSchoolStat::getYearOfEntering))
                .collect(Collectors.toList());

    }

    private static YearSchoolStat fromMap(Map.Entry<Integer, List<Entrant>> entry) {
        return new YearSchoolStat(entry.getKey(), (int) countOfSchool(entry.getValue()));
    }

    private static long countOfSchool(List<Entrant> list) {
        return list.stream().map(Entrant::getSchoolNumber).distinct().count();
    }
}
