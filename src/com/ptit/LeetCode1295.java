package com.ptit;

public class LeetCode1295 {

    public static int findNumbers(int[] nums) {
        int count = 0;
        for(int num : nums) {
            if(countNumberOfNum(num) % 2 == 0) {
                count += 1;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int [] nums = {555,901,482,1771};
        System.out.println(findNumbers(nums));

    }

    private static int countNumberOfNum(int num) {
        int lenNum = 0;
        while(num != 0) {
            num = num / 10;
            lenNum += 1;
        }
        return lenNum;
    }
}
