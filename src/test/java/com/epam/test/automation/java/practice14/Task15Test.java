package com.epam.test.automation.java.practice14;

import com.epam.test.automation.java.practice14.advanced.task15.CountryStat;
import com.epam.test.automation.java.practice14.advanced.task15.Good;
import com.epam.test.automation.java.practice14.advanced.task15.StorePrice;
import com.epam.test.automation.java.practice14.advanced.task15.Task15;
import org.testng.annotations.Test;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

public class Task15Test {
    @Test
    public void ifTask15ThenSuccess() {
        //given
        List<Good> current = Arrays.asList(
                new Good(1, "milk", "Poland"),
                new Good(2, "milk", "Russia"));
        List<StorePrice> current1 = Arrays.asList(
                new StorePrice(1, "BigShop", new BigDecimal("12.50")),
                new StorePrice(1, "SushiBar", new BigDecimal("10.50")),
                new StorePrice(2, "BigShop", new BigDecimal("12.50")));
        //when
        List<CountryStat> statList = Task15.name(current, current1);
        //then
        statList.forEach(System.out::println);
    }
}