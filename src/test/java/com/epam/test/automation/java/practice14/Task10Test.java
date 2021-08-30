package com.epam.test.automation.java.practice14;

import com.epam.test.automation.java.practice14.middle.Task10;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

public class Task10Test {
    @Test
    public void testIfTask10ThenSuceess() {
        //given
        List<String> list = Arrays.asList("asnsbiu", "asdsad", "asnsb", "asdf", "asdfb", "as", "a", "aop");
        //when
        List<String> result = Task10.getSortedLastLettersInUpperCase(list);
        //then
        System.out.println(result);
    }
}
