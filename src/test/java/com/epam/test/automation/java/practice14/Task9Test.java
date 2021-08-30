package com.epam.test.automation.java.practice14;

import com.epam.test.automation.java.practice14.middle.Task8;
import com.epam.test.automation.java.practice14.middle.Task9;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

public class Task9Test {
    @Test
    public void testIfTask9ThenSuceess() {
        //given
        List<String> list = Arrays.asList("ABC", "A", "BCD", "D");
        //when
        List<String> result = Task9.shouldReturnStringListWithLengthAndFirstLetter(list);
        //then
        System.out.println(result);
    }
}
