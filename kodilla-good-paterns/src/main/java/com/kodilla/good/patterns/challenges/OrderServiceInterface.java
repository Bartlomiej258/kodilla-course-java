package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public interface OrderServiceInterface {

    boolean order(User user, LocalDateTime from, LocalDateTime to, Product product);
}
