package com.swt.util.mathutil.core;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;
public class TestNG {

    // Tạo DataProvider tương đương với MethodSource của JUnit 5
    @DataProvider(name = "initData")
    public Object[][] initData() {
        return new Object[][] {
                {0, 1},
                {1, 1},
                {2, 2},
                {3, 6},
                {4, 24},
                {5, 120},
                {6, 720},
                {7, 5040},
                {8, 40320},
                {9, 362880},
                {10, 3628800}
        };
    }

    // Viết test method nhận tham số từ DataProvider
    @Test(dataProvider = "initData")
    public void testFactorialGivenRightArgsRunWell(int n, long expected) {
        Assert.assertEquals(MathUtility.getFactorial(n), expected);
    }
    
}