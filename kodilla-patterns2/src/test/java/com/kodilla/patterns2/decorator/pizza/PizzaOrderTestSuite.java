package com.kodilla.patterns2.decorator.pizza;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PizzaOrderTestSuite {

    @Test
    public void testBasicPizzaOrderPrice() {
        //Give
        Pizza pizza = new BasicPizzaDecorator();
        //When
        BigDecimal cost = pizza.getPizzaPrice();
        //Then
        assertEquals(new BigDecimal(15), cost);
    }

    @Test
    public void testBascicPizzaOrderIngredients() {
        //Give
        Pizza pizza = new BasicPizzaDecorator();
        //When
        String ingredients = pizza.getPizzaIngredients();
        //Then
        assertEquals("dough tomatoes sauce cheese", ingredients);
    }

    @Test
    public void testBasicPizzaWithPepperAndSalami() {
        //Given
        Pizza pizza = new BasicPizzaDecorator();
        pizza = new PepperPizzaDecorator(pizza);
        pizza = new SalamiPizzaDecorator(pizza);
        //When
        BigDecimal cost = pizza.getPizzaPrice();
        //Then
        assertEquals(new BigDecimal(22), cost);
    }

    @Test
    public void testBasciPizzaWithBaconMozzarellaPepper() {
        //Given
        Pizza pizza = new BasicPizzaDecorator();
        pizza = new BaconPizzaDecorator(pizza);
        pizza = new MozzarellaPizzaDecorator(pizza);
        pizza = new PepperPizzaDecorator(pizza);

        //When
        BigDecimal cost = pizza.getPizzaPrice();
        String ingredientsWithTableReservation = pizza.getPizzaIngredients();
        System.out.println(ingredientsWithTableReservation);
        //Then
        assertEquals(new BigDecimal(25), cost);
        assertEquals("dough tomatoes sauce cheese bacon mozzarella pepper", ingredientsWithTableReservation);
    }
}
