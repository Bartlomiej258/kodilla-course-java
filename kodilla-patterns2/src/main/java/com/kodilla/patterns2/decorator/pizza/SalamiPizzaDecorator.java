package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class SalamiPizzaDecorator extends AbstractPizzaDecorator {
    public SalamiPizzaDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public BigDecimal getPizzaPrice() {
        return super.getPizzaPrice().add(new BigDecimal(4));
    }

    @Override
    public String getPizzaIngredients() {
        return super.getPizzaIngredients() + " salami";
    }
}
