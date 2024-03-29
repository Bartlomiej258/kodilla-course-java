package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public abstract class AbstractPizzaDecorator implements Pizza {

    private final Pizza pizza;

    public AbstractPizzaDecorator(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public BigDecimal getPizzaPrice() {
        return pizza.getPizzaPrice();
    }

    @Override
    public String getPizzaIngredients() {
        return pizza.getPizzaIngredients();
    }
}
