package com.ptit;

import java.util.Arrays;

public class LeetCode2574 {

    public static int[] leftSum(int[] nums) {
        int n = nums.length;
        int[] leftSum = new int[n];
        int sum = 0;
        for (int i = 0;i < n;i++) {
            leftSum[i] = sum;
            sum += nums[i];
        }
        return leftSum;
    }

    public static int[] rightSum(int[] nums) {
        int m = nums.length;
        int[] rightSum = new int[m];
        int sum = 0;
        for (int i = m - 1;i >= 0;i--) {
            rightSum[i] = sum;
            sum += nums[i];
        }
        return rightSum;
    }

    public static int[] leftRightDifference(int[] nums) {
        int[] leftSum = leftSum(nums);
        int[] rightSum = rightSum(nums);
        int[] res = new int[nums.length];
        for (int i = 0;i < nums.length;i++) {
            res[i] = Math.abs(leftSum[i] - rightSum[i]);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = new int[] {10,4,8,3};
        System.out.println(Arrays.toString(leftRightDifference(nums)));
    }
}
