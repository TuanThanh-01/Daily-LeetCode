package com.ptit;

import java.util.ArrayList;
import java.util.Arrays;

public class LeetCode1389 {

    public static int[] createTargetArray(int[] nums, int[] index) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0;i < nums.length;i++) {
            arrayList.add(index[i], nums[i]);
        }
        int[] res = new int[nums.length];
        for (int i = 0;i < arrayList.size();i++) {
            res[i] = arrayList.get(i);
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(
                createTargetArray(new int[] {1,2,3,4,0}, new int[] {0,1,2,3,0})));
    }
}
