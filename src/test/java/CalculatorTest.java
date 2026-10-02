package com.devops;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculatorTest {

    @Test
    public void testAddition() {
        Calculator calculator = new Calculator();
        Assert.assertEquals(calculator.add(10, 20), 30);
    }

    @Test
    public void testMultiplication() {
        Calculator calculator = new Calculator();
        Assert.assertEquals(calculator.multiply(5, 4), 20);
    }
}