package com.swt.util.mathutil.core;


import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MainTest {
    Main main = new Main();

    @Test
    public void testInvalidLow() {
        assertEquals("Invalid", main.evaluateGrade(-5));
    }

    @Test
    public void testInvalidHigh() {
        assertEquals("Invalid", main.evaluateGrade(105));
    }

    @Test
    public void testExcellent() {
        assertEquals("Excellent", main.evaluateGrade(95));
    }

    @Test
    public void testGood() {
        assertEquals("Good", main.evaluateGrade(80));
    }

    @Test
    public void testPass() {
        assertEquals("Pass", main.evaluateGrade(60));
    }

    @Test
    public void testFail() {
        assertEquals("Fail", main.evaluateGrade(40));
    }

    @Test
    public void testDuplicate1() {
        assertEquals("Pass", main.evaluateGrade(60));
        assertEquals("Pass", main.evaluateGrade(60));
        assertEquals("Pass", main.evaluateGrade(60));
    }

    @Test
    public void testDuplicate2() {
        assertEquals("Pass", main.evaluateGrade(60));
        assertEquals("Pass", main.evaluateGrade(60));
        assertEquals("Pass", main.evaluateGrade(60));
    }

}
