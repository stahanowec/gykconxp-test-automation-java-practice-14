package com.epam.test.automation.java.practice14;

import com.epam.test.automation.java.practice14.low.Task5;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class Task5Test {
    @Test
    public void testIfTask5ThenSuceess() {
        //given
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        //when
        List<String> result = Task5.getSortedAscOddValues(list);
        //then
        System.out.println(result);
    }
}