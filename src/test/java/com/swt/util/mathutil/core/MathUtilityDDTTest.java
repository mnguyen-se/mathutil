//package com.swt.util.mathutil.core;
//
//import org.junit.jupiter.params.ParameterizedTest;
//import org.junit.jupiter.params.provider.MethodSource;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//class MathUtilityDDTTest {
//    // chuẩn bị bộ data để riêng - DD - Data driven
//    // lát hồi fill vào hàm so sánh T TESTING
//    // fill vào qua thâm số hàm - hàm làm việc với nhều data
//    // DDT còn gọi tên khác : parameterized testing -> kiểm thử theo kiểu tham số hóa
//    // bộ data : nằm trong hàm static - tĩnh 1 chỗ các nơi vào lấy
//    // bộ data : thường là mng 2 chiều, giá trị đầu vào và giá trị trả về
//
//    public static Object[][] initData() {
//        return new Object[][] {{0, 1},
//                                {1, 1},
//                                {2, 2},
//                                {3, 6},
//                                {4, 24},
//                                {5, 120},
//                                {6, 720}};
//    }
//    @ParameterizedTest
//    @MethodSource("initData")
//    public void testFactorialGivenRightArgsRunWell(int n, long expected) {
//        assertEquals(expected, MathUtility.getFactorial(n));
//    }
//
//}