package com.epam.test.automation.java.practice14;

import com.epam.test.automation.java.practice14.advanced.Entrant;
import com.epam.test.automation.java.practice14.advanced.YearSchoolStat;
import com.epam.test.automation.java.practice14.advanced.task13.Task13;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

public class Task13Test {
    @Test
    public void ifTask13ThenSuccess() {
        //given
        List<Entrant> current = Arrays.asList(
                new Entrant(11, 2003, "Ivanov"),
                new Entrant(11, 2001, "Petrov"),
                new Entrant(11, 1993, "Pupkin"),
                new Entrant(10, 2000, "Zobkin"),
                new Entrant(10, 1999, "Zabkin"),
                new Entrant(10, 1999, "Ivanov"),
                new Entrant(10, 2000, "Petrov"),
                new Entrant(14, 2001, "Pupkin"),
                new Entrant(15, 2000, "Zobkin"),
                new Entrant(10, 2000, "Ivanov"),
                new Entrant(12, 2003, "Petrov"),
                new Entrant(11, 2003, "Pupkin"),
                new Entrant(10, 2003, "Zobkin"));
        List<Integer> current1 = Arrays.asList(2001,
                1999,
                2000,
                2002,
                2003);
        //when
        List<YearSchoolStat> statList = Task13.getYearSchoolStatList(current, current1);
        //then
        statList.forEach(System.out::println);
    }
}
