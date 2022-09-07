package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class OrderRequestRetriever {

    public OrderRequest retrieve() {

        User user = new User("Mirosław", "Kowal", "Wrocław 22-233");
        Product product = new Product("Laptop", "Electronics", 2000);

        LocalDateTime dateFrom = LocalDateTime.of(2022, 9, 12, 20, 15);
        LocalDateTime dateTo = LocalDateTime.of(2022, 9, 13, 13, 15);

        return new OrderRequest(user, dateFrom, dateTo, product);
    }
}
