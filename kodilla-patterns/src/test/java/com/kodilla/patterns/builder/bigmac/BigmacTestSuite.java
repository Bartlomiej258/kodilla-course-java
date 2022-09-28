package com.kodilla.patterns.builder.bigmac;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BigmacTestSuite {

    @Test
    void BigmacNew() {
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .ingredient("lettuce")
                .ingredient("cucumber")
                .ingredient("mushromms")
                .ingredient("pepper")
                .bun("with sesame")
                .burgers("two")
                .sauce("garlic")
                .buid();
        System.out.println(bigmac);

        //When
        int howManyIngredients = bigmac.getIngredients().size();

        //Then
        Assertions.assertEquals(4, howManyIngredients);
    }
}
