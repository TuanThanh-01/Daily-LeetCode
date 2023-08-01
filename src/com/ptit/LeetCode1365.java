package com.ptit;

import java.util.Arrays;

public class LeetCode1365 {

    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] arrayMark = new int[101];
        int n = nums.length;
        int[] result = new int[n];
        for (int num : nums) {
            arrayMark[num] += 1;
        }
        for(int i = 1;i <= 100;i++) {
            arrayMark[i] += arrayMark[i - 1];
        }
        for (int i = 0; i < n;i++) {
            int tmp = nums[i];
            if(tmp == 0) {
                result[i] = 0;
            }
            else {
                result[i] = arrayMark[tmp - 1];
            }

        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(new int[] {8,1,2,2,3})));
    }
}
