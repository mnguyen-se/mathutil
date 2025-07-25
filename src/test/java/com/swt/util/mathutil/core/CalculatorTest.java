package com.swt.util.mathutil.core;


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    Calculator calc = new Calculator();

    @Test
    public void testAdd() {
        assertEquals(5, calc.add(2, 3));
        assertEquals(5, calc.add(2, 3)); // trùng dữ liệu
    }

    @Test
    public void testSubtract() {
        assertEquals(1, calc.subtract(4, 3));
    }

    @Test
    public void testMultiply() {
        assertEquals(6, calc.multiply(2, 3));
    }

    @Test
    public void testDivide() {
        assertEquals(2, calc.divide(6, 3));
    }

    @Test
    public void testDivideByZero() {
        Exception e = assertThrows(IllegalArgumentException.class, () -> {
            calc.divide(5, 0);
        });
        assertEquals("Cannot divide by zero", e.getMessage());
    }

    @Test
    public void testIsEven() {
        assertTrue(calc.isEven(4));
        assertFalse(calc.isEven(3));
    }
}
