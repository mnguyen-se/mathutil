package com.swt.util.mathutil.core;

public class Calculator {

    public int add(int a, int b) {
        return a + b;
    }


    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        if (b == 0) throw new IllegalArgumentException("Cannot divide by zero");
        return a / b;
    }

    public boolean isEven(int number) {
        return number % 2 == 0;
    }

    public String evaluateGrade(int score) {
        if (score < 0 || score > 100) {
            return "Invalid";
        }

        if (score >= 90) {
            return "Excellent";
        } else if (score >= 75) {
            return "Good";
        } else if (score >= 50) {
            return "Pass";
        } else {
            return "Fail";
        }
    }
}

