package com.kodilla.good.patterns.Food2Door;

import com.kodilla.good.patterns.Food2Door.Product;

import java.util.Map;

public class ExtraFoodShop implements FoodSupplier {

    private Map<String, Integer> listProduct = Map.of("beef", 5);

    @Override
    public boolean process(Customer customer, Product product, int count) {
        int availableProductCount = listProduct.getOrDefault(product, 0);

        if (availableProductCount >= count) {
            int available = availableProductCount - count;
            System.out.println("Available product " + available);
            System.out.println(customer.getName() + " order: " + count + product.getName());
            return true;
        } else
            System.out.println("Product is not available");
        return false;
    }
}
