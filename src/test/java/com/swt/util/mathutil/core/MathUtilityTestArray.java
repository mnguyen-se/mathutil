package com.swt.util.mathutil.core;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class MathUtilityTestArray {
    @DataProvider(name = "factorialData")
    public Object[][] provideFactorialData() {
        return new Object[][] {
                {1, 1},
                {2, 2},
                {3, 6},
                {4, 24},
                {5, 120},
                {6, 720},
                {7, 5040}
        };
    }

    @Test(dataProvider = "factorialData")
    public void testFactorialGivenValidArgumentReturnsWell(int input, long expected) {
        Assert.assertEquals(MathUtility.getFactorial(input), expected);
    }
}