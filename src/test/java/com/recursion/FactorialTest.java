package com.recursion;

import org.junit.Assert;
import org.junit.Test;

public class FactorialTest {
    Factorial factorial = new Factorial();

    @Test
    public void testGetFactorial() {
        Assert.assertEquals(120, factorial.getfactorial(5));
    }

    @Test(expected = NumberFormatException.class)
    public void testGetFactorial1() {
        factorial.getfactorial(0);
    }

    @Test(expected = NumberFormatException.class)
    public void testGetFactorial2() {
        factorial.getfactorial(-1);
    }
}