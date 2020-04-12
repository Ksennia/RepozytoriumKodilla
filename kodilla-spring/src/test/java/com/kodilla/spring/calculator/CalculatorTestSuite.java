package com.kodilla.spring.calculator;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculatorTestSuite {
    @Test
    public void testCalculations() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        double addTest = calculator.add(5.0, 7.0);
        double subTest = calculator.sub(15.0, 8.0);
        double mulTest = calculator.mul(5.0, 6.0);
        double divTest = calculator.div(35.0,7.0);
        //Then
        Assert.assertEquals(12.0, addTest, 1.0);
        Assert.assertEquals(7.0, subTest, 1.0);
        Assert.assertEquals(30.0, mulTest, 1.0);
        Assert.assertEquals(5, divTest, 1.0);
    }
}
