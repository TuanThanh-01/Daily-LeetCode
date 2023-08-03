package com.ptit;

import java.util.ArrayList;
import java.util.Arrays;

public class LeetCode1313 {

    public static int[] decompressRLElist(int[] nums) {
        int arrSize = 0;
        for (int i = 0; i < nums.length; i += 2) {
            arrSize += nums[i];
        }

        int[] res = new int[arrSize];

        int startIndex = 0;
        for (int i = 0; i < nums.length; i += 2) {
            Arrays.fill(res, startIndex, startIndex + nums[i], nums[i + 1]);
            startIndex += nums[i];
        }

        return res;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(decompressRLElist(new int[]{1, 2, 3, 4})));
    }
}
