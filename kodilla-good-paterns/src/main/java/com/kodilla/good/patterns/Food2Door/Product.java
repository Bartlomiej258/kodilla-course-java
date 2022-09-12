package com.kodilla.good.patterns.Food2Door;

public class Product {

    private String name;
    private FoodSupplier foodSupplier;

    public Product(String name, FoodSupplier foodSupplier) {
        this.name = name;
        this.foodSupplier = foodSupplier;
    }

    public String getName() {
        return name;
    }

    public FoodSupplier getFoodSupplier() {
        return foodSupplier;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Product product = (Product) o;

        if (name != null ? !name.equals(product.name) : product.name != null) return false;
        return foodSupplier != null ? foodSupplier.equals(product.foodSupplier) : product.foodSupplier == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (foodSupplier != null ? foodSupplier.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", foodSupplier=" + foodSupplier +
                '}';
    }
}
