package com.ptit;

import java.util.Arrays;

public class LeetCode66 {

//    public static boolean checkArray(int[] digits) {
//        for (int digit : digits) {
//            if (digit != 0) {
//                return false;
//            }
//        }
//        return true;
//    }
//
//    public static int[] plusOne(int[] digits) {
//        for(int i = digits.length - 1;i >= 0;){
//            digits[i] += 1;
//            if(digits[i] == 10) {
//                digits[i] = 0;
//                i--;
//            }
//            else {
//                break;
//            }
//        }
//        if(checkArray(digits)) {
//            int[] result = new int[digits.length + 1];
//            result[0] = 1;
//            System.arraycopy(digits, 0, result, 1, digits.length);
//            return result;
//        }
//        return digits;
//    }

    public static int[] plusOne(int[] digits) {
        for(int i = digits.length - 1;i >= 0;i--) {
            if(digits[i] < 9) {
                digits[i] += 1;
                return digits;
            }
            else {
                digits[i] = 0;
            }
        }

        int[] res = new int[digits.length + 1];
        res[0] = 1;
        System.arraycopy(digits, 0, res, 1, digits.length);
        return res;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(plusOne(new int[] {8, 9 ,9 ,9})));
    }
}
