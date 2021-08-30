package com.epam.test.automation.java.practice14;

import com.epam.test.automation.java.practice14.low.Task4;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class Task4Test {
    @Test
    public void testIfTask4ThenSuceess() {
        //given
        List<String> list = new ArrayList<>();
        list.add("8DC3");
        list.add("4F");
        list.add("B");
        list.add("3S");
        list.add("S3");
        list.add("A1");
        list.add("2A3G");
        list.add("1B");
        //when
        List<String> result = Task4.filterAndSortByLastDigit(2, list);
        //then
        System.out.println(result);
    }
}
