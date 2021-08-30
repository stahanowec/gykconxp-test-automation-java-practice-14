package com.epam.test.automation.java.practice14;

import com.epam.test.automation.java.practice14.middle.Task8;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

public class Task8Test {
    @Test
    public void testIfTask8ThenSuceess() {
        //given
        List<Integer> list = Arrays.asList(-10, 3, -3, 4, 55, 6);
        //when
        List<Integer> result = Task8.getSortedUnionTwoSubsetsIntegers(3, 4, list);
        //then
        System.out.println(result);
    }

}