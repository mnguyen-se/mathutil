package com.swt.util.mathutil.core;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class MathUtilityTestP {
    @Test
    public void testArg1RunAsWell() {
        Assert.assertEquals(MathUtility.getFactorial(1),1);
    }
    @Test
    public void testArg2RunAsWell() {
        Assert.assertEquals(MathUtility.getFactorial(2),2);
    }
    @Test
    public void testArg3RunAsWell() {
        Assert.assertEquals(MathUtility.getFactorial(3),6);
    }
    @Test
    public void testArg4RunAsWell() {
        Assert.assertEquals(MathUtility.getFactorial(4),24);
    }
    @Test
    public void testArg5RunAsWell() {
        Assert.assertEquals(MathUtility.getFactorial(5),120);
    }
    @Test
    public void testArg6RunAsWell() {
        Assert.assertEquals(MathUtility.getFactorial(6),720);
    }


}