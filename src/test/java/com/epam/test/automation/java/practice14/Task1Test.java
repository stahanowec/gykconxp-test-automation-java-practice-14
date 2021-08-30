package com.epam.test.automation.java.practice14;

import com.epam.test.automation.java.practice14.low.Task1;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class Task1Test {
    @Test
    public void testIfTask1ThenSuceess() {
        //given
        List<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("qwerty");
        list.add("asda");
        list.add("asdfa");
        list.add("as");
        list.add("a");
        //when
        List<String> result = Task1.filterByFirstAndLastCharacter('a', list);
        //then
        System.out.println(result);
    }
}
