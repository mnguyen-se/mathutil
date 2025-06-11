package com.swt.util.mathutil.core;

public class MathUtility {
    //class này dùng để cung cấp các hàm tính toán toán học
    // bắt chước class math trong jdk
    // vì những tính toán này, tính xong r trả ra, ko cần lưu trữ
    // do đó ta thiết kế nó dạng static

    //Ta làm hàm tính n! = 1.2.3.4....N
    // 0! = 1
    // ko có giai thừa âm, -5! ko hợp lệ
    // 20! vừa đủ kiểu long, 21! ko dùng long dc

    public static long getFactorial(int n) {
        if (n < 0 || n > 20){
            throw new IllegalArgumentException("n must be between 0 and 20");
        }

        if(n == 0) {
            return 1;
        }

        //cpu chayj dc ddeesn ddaay tuscw laf n = 1,2,3...20

        //tinhs n = 1,2,3.. thuat toan con heo dat, oc bu nhoi thit, nhan don, cong don tich luy
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
