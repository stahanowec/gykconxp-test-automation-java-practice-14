package com.epam.test.automation.java.practice14;

import com.epam.test.automation.java.practice14.middle.Task7;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class Task7Test {
    @Test
    public void testIfTask7ThenSuceess() {
        //given
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        //when
        List<Integer> result = Task7.getSortedDifferenceBetweenSubsets(5, list);
        //then
        System.out.println(result);
    }
}
