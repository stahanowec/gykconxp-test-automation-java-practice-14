package com.epam.test.automation.java.practice14;

import com.epam.test.automation.java.practice14.advanced.task12.NumberPair;
import com.epam.test.automation.java.practice14.advanced.task12.Task12;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

public class Task12Test {
    @Test
    public void ifTask12ThenSuccess() {
        //given
        List<Integer> current = Arrays.asList(1, 2, 33, 44);
        List<Integer> current1 = Arrays.asList(11, 22, 13);
        //when
        List<NumberPair> statList = Task12.makeNumberPairsFromTwoList(current, current1);
        //then
        System.out.println(statList);


    }

}