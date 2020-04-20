package com.kodilla.patterns.strategy.social;

import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {
    @Test
    public void testDefaultSharingStrategies() {
        //Given
        User don = new Millenials("Don Karleone");
        User donald = new YGeneration("Donald Duck");
        User quentin = new ZGeneration("Quentin Tarantino");

        //When
        String donShouldUse = don.showSocial();
        System.out.println("Don use: " + donShouldUse);

        String donaldShouldUse = donald.showSocial();
        System.out.println("Donald use: " + donaldShouldUse);

        String qwentinShouldUse = quentin.showSocial();
        System.out.println("Quentin use: " + qwentinShouldUse);

        //Then
        Assert.assertEquals("Facebook", donShouldUse);
        Assert.assertEquals("Twitter", donaldShouldUse);
        Assert.assertEquals("Snapchat", qwentinShouldUse);
    }

    @Test
    public void testIndividualSharingStrategy() {
        //Given
        User quentin = new ZGeneration("Quentin Tarantino");

        //When
        String quentinShouldUse = quentin.showSocial();
        System.out.println("Quentin use " + quentinShouldUse);
        quentin.sharePost( new FacebookPublisher());
        quentinShouldUse = quentin.showSocial();
        System.out.println("Quentin use " + quentinShouldUse);

        //Then
        Assert.assertEquals("Facebook", quentinShouldUse);
    }
}
