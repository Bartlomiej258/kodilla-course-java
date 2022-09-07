package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public interface OrderRepositoryInterface {
    void createOrder(User user, LocalDateTime from, LocalDateTime to, Product product);
}
