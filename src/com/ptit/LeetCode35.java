package com.ptit;

public class LeetCode35 {

    public static int searchInsert(int[] nums, int target) {
        int iLeft = 0;
        int iRight = nums.length - 1;
        while (iLeft <= iRight) {
            int mid = (iLeft + iRight) / 2;
            if(nums[mid] > target) {
                iRight = mid - 1;
            }
            else if(nums[mid] < target) {
                iLeft = mid + 1;
            }
            else {
                return mid;
            }
        }
        return iLeft;
    }

    public static void main(String[] args) {
        System.out.println(searchInsert(new int[] {1, 3}, 2));
    }
}
