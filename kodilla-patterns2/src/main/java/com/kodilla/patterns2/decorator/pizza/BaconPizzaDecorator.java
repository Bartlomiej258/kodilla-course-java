package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class BaconPizzaDecorator extends AbstractPizzaDecorator {
    public BaconPizzaDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public BigDecimal getPizzaPrice() {
        return super.getPizzaPrice().add(new BigDecimal(5));
    }

    @Override
    public String getPizzaIngredients() {
        return super.getPizzaIngredients() + " bacon";
    }
}
