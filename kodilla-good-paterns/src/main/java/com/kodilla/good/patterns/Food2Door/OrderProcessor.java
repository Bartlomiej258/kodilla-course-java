package com.kodilla.good.patterns.Food2Door;

public class OrderProcessor {

    void processAll(OrderRequest orderRequest) {
        orderRequest.getProducts().entrySet().stream()
                .map(p -> p.getKey().getFoodSupplier().process(orderRequest.getCustomer(), p.getKey(), p.getValue()))
                .forEach(System.out::println);
    }
}
