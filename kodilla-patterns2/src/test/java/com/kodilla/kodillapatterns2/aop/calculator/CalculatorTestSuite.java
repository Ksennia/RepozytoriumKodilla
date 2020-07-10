package com.kodilla.kodillapatterns2.aop.calculator;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
public class CalculatorTestSuite {

    @Autowired
    private  Calculator calculator;
    private static final Logger LOGGER =
             LoggerFactory.getLogger(CalculatorTestSuite.class);

    @Test
    public void testAdd(){
        //Given
        //When
        double res = calculator.add(10, 15);
        //Then
        LOGGER.info("Testing add method");
        assertEquals(25, res, 0);
    }
    @Test
    public void testSub(){
        //Given
        //When
        double res = calculator.sub(10, 15);
        //Then
        LOGGER.info("Testing sub method");
        assertEquals(-5, res, 0);
    }
    @Test
    public void testMul(){
            //Given
            //When
            double res = calculator.mul(10, 15);
            //Then
            LOGGER.info("Testing mul method");
            assertEquals(150, res, 0);
    }
    @Test
    public void testDiv(){
                //Given
                //When
                double res = calculator.div(15, 5);
                //Then
                LOGGER.info("Testing div method");
                assertEquals(3, res, 0);
    }
    @Test
    public void testFactorial() {
        //Given
        //When
        BigDecimal result = calculator.factrorial(new BigDecimal("1000"));
        //Then
        LOGGER.info("Testing factorial method" + result);
        assertTrue(BigDecimal.ONE.compareTo(result) < 0);

    }
}
