package com.epam.test.automation.java.practice14.advanced.task14;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Task14 {

    private Task14() {
    }

    public static List<ShopWithMaxDiscountOwner> getShopsWithMaxDiscountOwners(List<Supplier> supplierList, List<SupplierDiscount> supplierDiscountList) {
        Map<Integer, SupplierDiscount> data = supplierDiscountList.stream().collect(Collectors.groupingBy(SupplierDiscount::getStoreName))
                .values()
                .stream()
                .map(Task14::fromList)
                .filter(Objects::nonNull)
                .collect(Collectors.toMap(SupplierDiscount::getCustomerId, Function.identity()));

        return supplierList.stream()
                .map(i -> {
                    SupplierDiscount supplierDiscount = data.get(i.getCustomerId());
                    if (null == supplierDiscount) {
                        return new ShopWithMaxDiscountOwner(null, i);
                    }
                    return new ShopWithMaxDiscountOwner(supplierDiscount.getStoreName(), i);
                }).filter(f -> null != f.getStoreName())
                .sorted(Comparator.comparing(ShopWithMaxDiscountOwner::getStoreName)).collect(Collectors.toList());
    }

    private static SupplierDiscount fromList(List<SupplierDiscount> list) {
        return list.stream().min(Comparator.comparing(SupplierDiscount::getDiscountPercentage)
                .thenComparing(SupplierDiscount::getCustomerId)).orElse(null);
    }

}
