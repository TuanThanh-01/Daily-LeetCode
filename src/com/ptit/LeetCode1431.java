package com.ptit;

import java.util.ArrayList;
import java.util.List;

public class LeetCode1431 {

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();
        int maxValue = 0;
        for (int candy : candies) {
            maxValue = Math.max(candy, maxValue);
        }
        for (int candy: candies) {
            if(candy + extraCandies >= maxValue) {
                result.add(true);
            }
            else {
                result.add(false);
            }
        }
        return result;
    }

    public static void main(String[] args) {

    }
}
