package com.epam.test.automation.java.practice14;

import com.epam.test.automation.java.practice14.low.Task3;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class Task3Test {
    @Test
    public void testIfTask3ThenSuceess() {
        //given
        List<String> list = new ArrayList<>();
        list.add("asd");
        list.add("a");
        list.add("basdw");
        //when
        List<String> result = Task3.getListExtremeLetters(list);
        //then
        System.out.println(result);
    }
}
