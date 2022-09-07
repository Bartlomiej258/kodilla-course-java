package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class OrderRequest {

    private User user;
    private LocalDateTime from;
    private LocalDateTime to;
    private Product product;

    public OrderRequest(User user, LocalDateTime from, LocalDateTime to, Product product) {
        this.user = user;
        this.from = from;
        this.to = to;
        this.product = product;
    }

    public User getUser() {
        return user;
    }

    public LocalDateTime getFrom() {
        return from;
    }

    public LocalDateTime getTo() {
        return to;
    }

    public Product getProduct() {
        return product;
    }
}
