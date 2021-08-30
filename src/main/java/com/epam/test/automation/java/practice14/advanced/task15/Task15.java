package com.epam.test.automation.java.practice14.advanced.task15;

import java.math.BigDecimal;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Task15 {

    private Task15() {
    }

    public static List<CountryStat> name(List<Good> goodList, List<StorePrice> storePriceList) {
        Map<Integer, List<StorePrice>> priceMap = storePriceList.stream().collect(Collectors.groupingBy(StorePrice::getProductSKU));

        return goodList.stream()
                .map(u -> {
                    List<StorePrice> storePrice = priceMap.get(u.getProductSKU());
                    BigDecimal price = storePrice.stream().min(Comparator.comparing(StorePrice::getPrice)).map(StorePrice::getPrice).orElse(BigDecimal.ZERO);
                    return new CountryStat(u.getCountryOfOrigin(), storePrice.size(), price);
                }).sorted(Comparator.comparing(CountryStat::getCountryOfOrigin))
                .collect(Collectors.toList());
    }
}
