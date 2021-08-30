package com.epam.test.automation.java.practice14;

import com.epam.test.automation.java.practice14.middle.Task6;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class Task6Test {
    @Test
    public void testIfTask5ThenSuceess() {
        //given
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(4);

        List<String> stringList = new ArrayList<>();
        stringList.add("1aa");
        stringList.add("aaa");
        stringList.add("1");
        stringList.add("a");
        //when
        List<String> result = Task6.shouldReturnStringWithFirstLetterDigitAndLengthEqualsNumber(list, stringList);
        //then
        System.out.println(result);
    }
}
