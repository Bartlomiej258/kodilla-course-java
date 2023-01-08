package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class MozzarellaPizzaDecorator extends AbstractPizzaDecorator {
    public MozzarellaPizzaDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public BigDecimal getPizzaPrice() {
        return super.getPizzaPrice().add(new BigDecimal(2));
    }

    @Override
    public String getPizzaIngredients() {
        return super.getPizzaIngredients() + " mozzarella";
    }
}
