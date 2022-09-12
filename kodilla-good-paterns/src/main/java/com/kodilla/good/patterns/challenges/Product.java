package com.kodilla.good.patterns.challenges;

import com.kodilla.good.patterns.Food2Door.Food2Door;

class Product {
    private String productName;
    private String category;
    private double price;

    public Product(String productName, String category, double price) {
        this.productName = productName;
        this.category = category;
        this.price = price;
    }

    public String getProductName() {
        return productName;
    }

    public String getCategory() {
        return category;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productName='" + productName + '\'' +
                ", category='" + category + '\'' +
                ", price=" + price +
                '}';
    }

}
