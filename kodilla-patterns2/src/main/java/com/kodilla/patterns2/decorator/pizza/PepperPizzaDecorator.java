package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class PepperPizzaDecorator extends AbstractPizzaDecorator {
    public PepperPizzaDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public BigDecimal getPizzaPrice() {
        return super.getPizzaPrice().add(new BigDecimal(3));
    }

    @Override
    public String getPizzaIngredients() {
        return super.getPizzaIngredients() + " pepper";
    }
}
