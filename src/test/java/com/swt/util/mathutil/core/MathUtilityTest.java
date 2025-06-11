package com.swt.util.mathutil.core;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathUtilityTest {

    @Test //@test tương đương với main, code trong hàm này sẽ run nhu hàm main
    //biến mỗi test case thành test run thành main để chạy
    public void verifyFactorialGivenRightArg0RunWell() {
        //0! có là 1 hay ko
        assertEquals(1,MathUtility.getFactorial(0));
    }
@Test
    public void verifyFactorialGivenRightArg1RunWell() {
        //0! có là 1 hay ko
        assertEquals(1,MathUtility.getFactorial(1));
    }
    @Test
    public void verifyFactorialGivenRightArgRunWell() {
        //0! có là 1 hay ko
        assertEquals(2,MathUtility.getFactorial(2));
        assertEquals(6,MathUtility.getFactorial(3));
        assertEquals(24,MathUtility.getFactorial(4));
    }
}