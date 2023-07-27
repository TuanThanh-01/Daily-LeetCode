package com.ptit;

import java.util.Arrays;

public class LeetCode88 {

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        for(int ai : nums2) {
            nums1[m] = ai;
            m++;
        }
        Arrays.sort(nums1);
    }



    public static void main(String[] args) {

    }
}
