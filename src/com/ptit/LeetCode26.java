package com.ptit;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;

public class LeetCode26 {



    public static int removeDuplicates(int[] nums) {
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        for(int num : nums) {
            set.add(num);
        }
        Arrays.fill(nums, 0);
        int i = 0;
        for (Integer num : set) {
            nums[i] = num;
            i++;
        }
        return set.size();
    }

    public static void main(String[] args) {
        System.out.println(removeDuplicates(new int[] {0,0,1,1,1,2,2,3,3,4}));
    }
}
