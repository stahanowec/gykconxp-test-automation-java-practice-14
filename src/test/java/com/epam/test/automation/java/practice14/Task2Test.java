package com.epam.test.automation.java.practice14;

import com.epam.test.automation.java.practice14.low.Task2;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class Task2Test {

    @Test
    public void testSortAscLengthsOfStrings() {
        //given
        List<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("world");
        list.add("!");
        list.add("Good");
        list.add("morning");
        list.add("!");
        //when
        List<Integer> result = Task2.sortAscLengthsOfStrings(list);
        //then
        System.out.println(result);
    }
}
