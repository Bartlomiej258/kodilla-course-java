package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class ProductOrderService implements OrderServiceInterface {

    @Override
    public boolean order(User user, LocalDateTime from, LocalDateTime to, Product product) {
        System.out.println("User: " + user + " was ordered: " + product.getProductName() + " on" +
                from.toString() + " the product will be delivered on " + to.toString());
        return true;
    }
}
