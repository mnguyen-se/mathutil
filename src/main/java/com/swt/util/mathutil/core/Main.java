package com.swt.util.mathutil.core;

public class Main {
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

