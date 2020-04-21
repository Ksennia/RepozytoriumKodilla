package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {
    @Test
    public void testBigMac() {
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .bun("With sezam")
                .sauce("sos BigMac")
                .burgers(2)
                .ingredients("Onion")
                .ingredients("Pickles")
                .ingredients("Salat")
                .ingredients("Cheese")
                .build();
        System.out.println(bigmac);
        //When
        int howManyIngredients = bigmac.getIngredients().size();
        int howManyBeef = bigmac.getBurgers();
        String whichBun = bigmac.getBun();
        //Then
        Assert.assertEquals(4, howManyIngredients);
        Assert.assertEquals(2, howManyBeef);
        Assert.assertEquals("With sezam", whichBun);
    }
}
