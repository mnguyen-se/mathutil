package com.swt.util;

import com.swt.util.mathutil.core.MathUtility;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

    verifyFactorialGivenRightArg0RunWell();
    verifyFactorialGivenRightArg1RunWell();
    verifyFactorialGivenRightArg2RunWell();
    verifyFactorialGivenRightArg3RunWell();
    verifyFactorialGivenRightArg4RunWell();
    }

    //test thử hàm tính giai thừa, gọi trong main()
    //muốn test gì đó phải có test case
    //Test case #1 : Verify the gettfactorial() with n = 0;
    // Step 1 :
    // give n = 0
    // call getFactorial(n = 0)
    // expected result : 1as actual result : 1
    // status : passed or failed phải chờ

    public static void verifyFactorialGivenRightArg4RunWell(){
        int n = 4;
        long expected = 24; // hi vọng trả về 1 nếu 1!
        long actual = MathUtility.getFactorial(n);
        //so sánh
        System.out.println("4! = " + expected + " actual = " + actual );
        System.out.println("5! = 120  actual = " + MathUtility.getFactorial(5) );
        System.out.println("6! = 720  actual = " + MathUtility.getFactorial(6) );
    }

    public static void verifyFactorialGivenRightArg3RunWell(){
        int n = 3;
        long expected = 6; // hi vọng trả về 1 nếu 1!
        long actual = MathUtility.getFactorial(n);
        //so sánh
        System.out.println("3! = " + expected + " actual = " + actual );
    }

    public static void verifyFactorialGivenRightArg2RunWell(){
        int n = 2;
        long expected = 2; // hi vọng trả về 1 nếu 1!
        long actual = MathUtility.getFactorial(n);
        //so sánh
        System.out.println("2! = " + expected + " actual = " + actual );
    }

    public static void verifyFactorialGivenRightArg1RunWell(){
        int n = 1;
        long expected = 1; // hi vọng trả về 1 nếu 1!
        long actual = MathUtility.getFactorial(n);
        //so sánh
        System.out.println("1! = " + expected + " actual = " + actual );
    }

    public static void verifyFactorialGivenRightArg0RunWell(){
        int n = 0;
        long expected = 1; // hi vọng trả về 1 nếu 0!
        long actual = MathUtility.getFactorial(n);
        //so sánh
        System.out.println("0! = " + expected + " actual = " + actual );
    }
    // kĩ thuật vừa gõ code, vừa gõ test case,vừa gõ test run dc gọi là TDD (đưa vao CV) : Test Driven Development
}