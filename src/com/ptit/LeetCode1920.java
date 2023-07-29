package com.ptit;

public class LeetCode1920 {

    public static int[] buildArray(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        for(int i = 0;i < n;i++) {
            ans[i] = nums[nums[i]];
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {0, 2, 1, 5, 3, 4};
        int[] ans = buildArray(nums);
        for(int num : ans) {
            System.out.print(num + " ");
        }
    }
}
