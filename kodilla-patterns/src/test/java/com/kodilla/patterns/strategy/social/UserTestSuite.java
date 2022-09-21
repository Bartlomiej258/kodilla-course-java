package com.kodilla.patterns.strategy.social;

import org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTestSuite {

    @Test
    void testDefaultSharingStrategies() {
    //Given
        User zofia = new Millenials("Zofia");
        User piotr = new YGeneration("Piotr");
        User darek = new ZGeneration("Darek");

    //When
        String zofiaShouldUse = zofia.sharePost();
        System.out.println("Zofia should use: " + zofiaShouldUse);
        String piotrShouldUse = piotr.sharePost();
        System.out.println("Piotr should use: " + piotrShouldUse);
        String darekShouldUse = darek.sharePost();
        System.out.println("Darek should use: " + darekShouldUse);

        //When
        assertEquals("Facebook", zofiaShouldUse);
        assertEquals("Twitter", piotrShouldUse);
        assertEquals("Snapchat", darekShouldUse);
    }

    @Test
    void testIndividualSharingStrategy() {
        //Given
        User zofia = new Millenials("Zofia");

        //When
        String zofiaShouldUse = zofia.sharePost();
        System.out.println("Zofia should use: " + zofiaShouldUse);
        zofia.setSocialPublisher(new TwitterPublisher());
        zofiaShouldUse = zofia.sharePost();
        System.out.println("Zofia now should use: " + zofiaShouldUse);

        //Then
        assertEquals("Twitter", zofiaShouldUse);
    }
}
