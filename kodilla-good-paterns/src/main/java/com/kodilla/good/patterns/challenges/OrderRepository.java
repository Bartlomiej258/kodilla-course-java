package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class OrderRepository implements OrderRepositoryInterface {


    @Override
    public void createOrder(User user, LocalDateTime from, LocalDateTime to, Product product) {
        System.out.println("created user " + user.getFirstName() + " " + user.getLastName() + " in DB");
    }
}
