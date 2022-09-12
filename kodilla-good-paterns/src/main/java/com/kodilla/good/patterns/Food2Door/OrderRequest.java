package com.kodilla.good.patterns.Food2Door;

import java.util.Map;

public class OrderRequest {

    private Customer customer;
    private Map<Product, Integer> products;

    public OrderRequest(Customer customer, Map<Product, Integer> products) {
        this.customer = customer;
        this.products = products;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Map<Product, Integer> getProducts() {
        return products;
    }

    @Override
    public String toString() {
        return "OrderRequest{" +
                "customer=" + customer +
                ", products=" + products +
                '}';
    }
}
