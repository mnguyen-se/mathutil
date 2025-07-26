package com.swt.util.mathutil.core;


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

 class CalculatorTest {

    Calculator calc = new Calculator();

    @Test
    void testAdd() {
        assertEquals(5, calc.add(2, 3));
        assertEquals(5, calc.add(2, 3));
    }

    @Test
    void testSubtract() {
        assertEquals(1, calc.subtract(4, 3));
    }

    @Test
    void testMultiply() {
        assertEquals(6, calc.multiply(2, 3));
    }

    @Test
    void testDivide() {
        assertEquals(2, calc.divide(6, 3));
    }

    @Test
    void testDivideByZero() {
        Exception e = assertThrows(IllegalArgumentException.class, () -> {
            calc.divide(5, 0);
        });
        assertEquals("Cannot divide by zero", e.getMessage());
    }

    @Test
    void testIsEven() {
        assertTrue(calc.isEven(4));
        assertFalse(calc.isEven(3));
    }

    @Test
    void testEvaluateGrade() {
        assertEquals("Excellent", calc.evaluateGrade(95));
        assertEquals("Good", calc.evaluateGrade(80));
        assertEquals("Pass", calc.evaluateGrade(60));
        assertEquals("Fail", calc.evaluateGrade(30));
        assertEquals("Invalid", calc.evaluateGrade(-10));
        assertEquals("Invalid", calc.evaluateGrade(110));
    }
}
