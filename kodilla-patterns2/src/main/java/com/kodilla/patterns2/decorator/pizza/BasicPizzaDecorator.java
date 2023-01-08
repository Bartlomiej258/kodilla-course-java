package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class BasicPizzaDecorator implements Pizza {

    @Override
    public BigDecimal getPizzaPrice() {
        return new BigDecimal(15);
    }

    @Override
    public String getPizzaIngredients() {
        return "dough tomatoes sauce cheese";
    }
}
