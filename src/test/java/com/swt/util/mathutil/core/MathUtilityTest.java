package com.swt.util.mathutil.core;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;
public class MathUtilityTest {
    @Test
    public void testFactorialGivenRightArgumentReturnsWell() {
        // Test các giá trị hợp lệ
        Assert.assertEquals(MathUtility.getFactorial(0), 1);
        Assert.assertEquals(MathUtility.getFactorial(1), 1);
        Assert.assertEquals(MathUtility.getFactorial(2), 2);
        Assert.assertEquals(MathUtility.getFactorial(3), 6);
        Assert.assertEquals(MathUtility.getFactorial(5), 120);
        Assert.assertEquals(MathUtility.getFactorial(6), 720);
        Assert.assertEquals(MathUtility.getFactorial(20), 2432902008176640000L);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testFactorialGivenWrongArgumentThrowsException_Negative() {
        MathUtility.getFactorial(-5);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testFactorialGivenWrongArgumentThrowsException_TooLarge() {
        MathUtility.getFactorial(21);
    }
    
}